package composite.entities

import composite.TestComponent


data class TestGroup(
    private val id: Int,
    private val name: String,
): TestComponent() {

    private var testComponents = arrayListOf<TestComponent>()

    override fun add(testComponent: TestComponent) {
        testComponents.add(testComponent)
    }

    override fun addAll(testComponentList: List<TestComponent>) {
        testComponents.addAll(testComponentList)
    }

    override fun remove(testComponent: TestComponent) {
        testComponents.remove(testComponent)
    }

    override fun getChild(id: Int): TestComponent {
        return testComponents[id]
    }

    override fun getName(): String {
        return name
    }

    override fun getId(): Int {
        return id
    }

    override fun print() {
        val iterator = testComponents.iterator()
        while (iterator.hasNext()) {
            val component = iterator.next()
            component.print()
        }

        println("---$name ($id)---")
    }
}