package observer.station

import observer.Beehive
import observer.BeehiveSubject
import observer.Observer

class MoscowStation(private val beehiveSubject: BeehiveSubject) : Observer {


    init {
        beehiveSubject.registerObserver(this)
    }

    override fun update(beehive: Beehive) {
        println("${MoscowStation::class.simpleName} || sound ${beehive.frequencySound} || weight ${beehive.weight}")
    }

    override fun alarm(bearIsHere: Boolean) {
        println("${MoscowStation::class.simpleName} || медведь здесь? $bearIsHere")
        if (bearIsHere) {
            beehiveSubject.removeObserver(this)
        }
    }
}