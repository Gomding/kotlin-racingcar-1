package racingcar

@JvmInline
value class Cars(val value: List<Car>) {

    fun moveForwardAll(refuels: List<Int>): Cars {
        val carsAndRefuels = value zip refuels
        return Cars(carsAndRefuels.map { it.first.moveForward(it.second) })
    }

    fun distancesMoved(): List<Int> {
        return value.map { it.distanceMoved }
    }

    companion object {
        fun initCars(numberOfParticipants: Int): Cars {
            return Cars(List(numberOfParticipants) { Car() })
        }
    }
}
