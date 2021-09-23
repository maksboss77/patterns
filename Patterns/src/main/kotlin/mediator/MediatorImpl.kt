package mediator

class MediatorImpl(
    private val light: Light,
    private val music: Music
) : Mediator {

    override fun partyModeOn() {
        light.on()
        music.on()
        music.setVolume(100)

    }

    override fun partyModeOff() {
        light.off()
        music.off()
    }

    override fun setVolume(volume: Int) {
        music.setVolume(volume)
    }

    override fun setColor(color: String) {
        light.setColor(color)
    }

    override fun lightOn() {
        light.on()
    }

    override fun lightOff() {
        light.off()
    }

    override fun musicOn() {
        music.on()
    }

    override fun musicOff() {
        music.off()
    }
}