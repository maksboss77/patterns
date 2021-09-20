package observer

import observer.station.SanktPeterburgStation
import observer.station.MoscowStation

fun main() {
    val beehiveSubject = BeehiveSubject()

    val moscowStation = MoscowStation(beehiveSubject)
    beehiveSubject.registerObserver(moscowStation)

    val sanktPeterburgStation = SanktPeterburgStation(beehiveSubject)
    beehiveSubject.registerObserver(sanktPeterburgStation)

    beehiveSubject.updateBeehiveStatus(50, 5)
    beehiveSubject.updateBeehiveStatus(25, 5)
    beehiveSubject.updateBeehiveStatus(75, 5)
    beehiveSubject.updateBeehiveStatus(85, 6)
    beehiveSubject.updateBeehiveStatus(90, 7)
    beehiveSubject.updateAlarmStatus(false)
    beehiveSubject.updateBeehiveStatus(90,7)
    beehiveSubject.updateBeehiveStatus(95, 8)
    beehiveSubject.updateBeehiveStatus(60, 5)
    beehiveSubject.updateBeehiveStatus(40, 4)
    beehiveSubject.updateAlarmStatus(true)
    beehiveSubject.removeObserver(moscowStation)
    beehiveSubject.updateBeehiveStatus(2, 0)
    beehiveSubject.updateBeehiveStatus(1, 0)
    beehiveSubject.updateBeehiveStatus(1, 0)
    beehiveSubject.updateBeehiveStatus(0, 0)


}