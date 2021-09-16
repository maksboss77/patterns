package observer

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver(beehive: Beehive)
    fun alarmObserver(bearIsHere: Boolean)
}