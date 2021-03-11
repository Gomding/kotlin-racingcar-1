package controller

import domain.racingcar.Cars
import domain.racingcar.RacingCars
import domain.racingcar.RandomConditions
import view.ResultView
import view.ResultView.printRacing

fun main() {
    val carNames = Reception.receiveCarNames()
    val numberOfAttempts = Reception.receiveNumberOfAttempts()

    val cars = Cars.createCars(carNames)
    val racingCar = RacingCars(cars, RandomConditions())

    ResultView.printInt()
    val overallResult = racingCar.racing(numberOfAttempts)

    printRacing(overallResult, cars)
}