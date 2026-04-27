package week10

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    fun searchByName(keyword: String): List<T> {
        return items.filter {
            try {
                val field = it!!::class.java.getDeclaredField("name")
                field.isAccessible = true
                val value = field.get(it) as String
                value.contains(keyword, ignoreCase = true)
            } catch (e: Exception) {
                false
            }
        }
    }
}