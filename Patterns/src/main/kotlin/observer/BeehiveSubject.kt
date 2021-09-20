package observer

import observer.station.Observer

class BeehiveSubject : Subject {

    private val observers = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver(beehive: Beehive) {
        observers.forEach { observer ->
            observer.update(beehive)
        }
    }


    override fun alarmObserver(bearIsHere: Boolean) {
        observers.forEach { observer ->
            observer.alarm(bearIsHere)
        }
    }

    fun updateBeehiveStatus(frequencySound: Int, weight: Int) {
        val beehive = Beehive(frequencySound, weight)
        notifyObserver(beehive)
    }

    fun updateAlarmStatus(bearIsHere: Boolean) {
        alarmObserver(bearIsHere)
    }
}