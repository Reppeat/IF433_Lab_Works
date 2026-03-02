package week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        val availableLimit = limit - usedAmount

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Kartu Kredit berhasil!")
            println("   Akun           : $accountName")
            println("   Dibayar        : Rp$amount")
            println("   Total Terpakai : Rp$usedAmount")
            println("   Sisa Limit     : Rp${limit - usedAmount}")
        } else {
            println("Transaksi ditolak! Limit tidak mencukupi.")
            println("   Akun           : $accountName")
            println("   Limit Total    : Rp$limit")
            println("   Sudah Terpakai : Rp$usedAmount")
            println("   Sisa Limit     : Rp$availableLimit")
            println("   Dibutuhkan     : Rp$amount")
        }
    }
}
