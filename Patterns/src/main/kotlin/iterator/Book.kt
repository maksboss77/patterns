package iterator

data class Book(
    val name: String,
    val author: String,
    val year: Int
) {
    companion object {
        val DEFAULT_LIST = listOf<Book>(
            Book("Магия фотографий", "Сергей Фираго", 2010),
            Book("Не откинуть кноньки", "Максим Савельев", 2020),
            Book("Джуны, как дети", "Сергей Фираго", 2020),
            Book("Сервисы", "Глеб Логачев", 2021),
            Book("Курсы НБ РБ", "Сергей Фираго", 2017),
            Book("От джуна к колдуну", "Сибериан.про", 2015),
        )
    }
}
