package composite.entities

import composite.TestComponent

class Test(
    private val groupId: Int,
    private val name: String
) : TestComponent() {

    override fun getParentId(): Int {
        return groupId
    }

    override fun getId(): Int {
        return groupId
    }

    override fun getName(): String {
        return name
    }

    override fun print() {
        println("TEST: << $name>> ($groupId)")
    }
}
