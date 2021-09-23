package mediator

class Home(override val mediator: Mediator) : Component {


    fun lightOn() {
        mediator.lightOn()
    }

    fun lightOff() {
        mediator.lightOff()
    }

    fun musicOn() {
        mediator.musicOn()
    }

    fun musicOff() {
        mediator.lightOff()
    }

    fun partyModeOn() {
        mediator.partyModeOn()
    }

    fun partyModeOff() {
        mediator.partyModeOff()
    }

}