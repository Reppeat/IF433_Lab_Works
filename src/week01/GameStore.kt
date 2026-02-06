package week01

fun main() {


    val gameTitle = "Elden Ring"
    val price = 750_000

    // Fungsi diskon (Expression Body)
    fun calculateDiscount(price: Int): Int =
        if (price > 500_000)
            price - (price * 20 / 100)
        else
            price - (price * 10 / 100)
}

