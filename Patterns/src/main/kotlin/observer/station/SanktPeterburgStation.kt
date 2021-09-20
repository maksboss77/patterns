package observer.station

import observer.Beehive
import observer.BeehiveSubject

class SanktPeterburgStation(private val beehiveSubject: BeehiveSubject) : Observer {

    override fun update(beehive: Beehive) {
        println("${SanktPeterburgStation::class.simpleName} || sound ${beehive.frequencySound} || weight ${beehive.weight}")
    }

    override fun alarm(bearIsHere: Boolean) {
        println("${SanktPeterburgStation::class.simpleName} || медведь здесь? $bearIsHere, продолжаем следить...")
    }
}