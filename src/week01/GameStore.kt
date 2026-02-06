package week01

fun main() {


    val gameTitle = "Elden Ring"
    val price = 750_000
    val userNote: String? = null

    // Fungsi diskon (Expression Body)
    fun calculateDiscount(price: Int): Int =
        if (price > 500_000)
            price - (price * 20 / 100)
        else
            price - (price * 10 / 100)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

// Fungsi diskon (Expression Body)
fun calculateDiscount(price: Int): Int =
    if (price > 500_000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}

