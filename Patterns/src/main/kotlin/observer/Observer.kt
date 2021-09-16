package observer

interface Observer {
    fun update(beehive: Beehive)
    fun alarm(bearIsHere: Boolean)
}