package observer

class BeehiveSubject : Subject {

    private val observers = arrayListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        //не удаляй, пока не оповестил всех!
        observers.remove(observer)
    }

    override fun notifyObserver(beehive: Beehive) {
        observers.forEach { observer ->
            observer.update(beehive)
        }
    }


    //TODO: если отписывается один из слушателей, то до других не доходит Alarm
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