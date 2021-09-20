package observer.station

import observer.Beehive

interface Observer {
    fun update(beehive: Beehive)
    fun alarm(bearIsHere: Boolean)
}