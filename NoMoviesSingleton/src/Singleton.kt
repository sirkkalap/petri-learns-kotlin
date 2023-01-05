object NoMoviesList : List<String> {
    override val size: Int
        get() = 0

    override fun contains(element: String): Boolean = false

    override fun containsAll(elements: Collection<String>): Boolean = false

    override fun get(index: Int): String = emptyList<String>().get(index)

    override fun indexOf(element: String): Int = -1

    override fun isEmpty(): Boolean = true

    override fun iterator(): Iterator<String> = emptyList<String>().iterator()

    override fun lastIndexOf(element: String): Int = -1

    override fun listIterator(): ListIterator<String> = emptyList<String>().listIterator()

    override fun listIterator(index: Int): ListIterator<String> = emptyList<String>().listIterator(index)

    override fun subList(fromIndex: Int, toIndex: Int): List<String> = emptyList<String>().subList(fromIndex, toIndex)
}

fun printMovies(movies:List<String>) {
    for (m in movies) {
        println(m)
    }
}

fun main() {
    printMovies(NoMoviesList)
}