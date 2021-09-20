package composite.entities

sealed class TestComponent {
    abstract fun add(testComponent: TestComponent)
    abstract fun addAll(testComponentList: List<TestComponent>)
    abstract fun remove(testComponent: TestComponent)

    abstract fun getChild(id: Int): TestComponent
    abstract fun getId(): Int
    abstract fun getParentId(): Int

    abstract fun getName(): String
    abstract fun print()
}