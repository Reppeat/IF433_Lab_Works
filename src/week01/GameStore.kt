package week01

val gameTitle = "Elden Ring"
val price = 750_000

fun calculateDiscount(price: Int) =
    if (price > 500_000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)

