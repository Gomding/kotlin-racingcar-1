package racingcar

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe

class RacingResultTest : FunSpec({

    test("라운드 정보와 참여한 자동차들의 정보를 받아서 한 라운드의 레이스 결과를 생성한다.") {
        // given
        val cars = Cars(listOf(Car(4, CarName.of("charlie")), Car(3, CarName.of("brown"))))

        // when
        val racingResult = RacingResult.of(round = 1, cars = cars)

        // then
        racingResult.round shouldBe 1
        racingResult.carsResult().map { it.distanceMoved }.shouldContainExactly(4, 3)
        racingResult.carsResult().map { it.name() }.shouldContainExactly("charlie", "brown")
    }
})
