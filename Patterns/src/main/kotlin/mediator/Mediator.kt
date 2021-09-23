package mediator

interface Mediator {

    fun lightOn()
    fun lightOff()

    fun musicOn()
    fun musicOff()

    fun partyModeOn()
    fun partyModeOff()
    fun setVolume(volume: Int)
    fun setColor(color: String)

}