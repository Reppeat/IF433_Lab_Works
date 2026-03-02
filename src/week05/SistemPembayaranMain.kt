package week05

fun main() {

    val eWallet = EWallet(accountName = "Budi Santoso", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Sari Dewi", limit = 100000.0)


    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("======================================")
    println("  SISTEM PEMBAYARAN E-COMMERCE")
    println("  Jumlah Tagihan: Rp75000.0")
    println("======================================")
    println()

    for (payment in paymentMethods) {
        println("--------------------------------------")
        println("  Metode: ${payment::class.simpleName}")
        println("--------------------------------------")
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            println()
            println("   [Smart Cast -> EWallet terdeteksi!]")
            println("   Melakukan top-up otomatis Rp50000.0...")
            payment.topUp(50000.0)
        }

        println()
    }

    println("======================================")
    println("  Runtime Polymorphism: Kotlin memilih")
    println("  processPayment() yang tepat saat")
    println("  PROGRAM BERJALAN (runtime), bukan")
    println("  saat kompilasi.")
    println("======================================")
}