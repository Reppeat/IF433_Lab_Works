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
            println("   ⚡ [Smart Cast] Tipe EWallet terdeteksi!")
            println("   Saldo tidak cukup, top-up otomatis Rp50000.0...")
            println()
            payment.topUp(50000.0)
            println()
            println("   🔁 Mencoba processPayment(75000.0) lagi setelah top-up...")
            println()
            payment.processPayment(75000.0)
        }
        println()
    }
    println("======================================")
    println("  Smart Cast berhasil! Kotlin otomatis")
    println("  mengenali tipe EWallet di dalam loop")
    println("  bertipe PaymentMethod.")
    println("======================================")
}