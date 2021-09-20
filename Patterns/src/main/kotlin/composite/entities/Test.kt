package composite.entities

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

    override fun add(testComponent: TestComponent) {
        TODO("Not yet implemented")
    }

    override fun addAll(testComponentList: List<TestComponent>) {
        TODO("Not yet implemented")
    }

    override fun remove(testComponent: TestComponent) {
        TODO("Not yet implemented")
    }

    override fun getChild(id: Int): TestComponent {
        TODO("Not yet implemented")
    }

}