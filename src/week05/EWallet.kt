package week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran E-Wallet berhasil!")
            println("   Akun     : $accountName")
            println("   Dibayar  : Rp$amount")
            println("   Sisa Saldo: Rp$balance")
        } else {
            println("Saldo tidak cukup!")
            println("   Akun      : $accountName")
            println("   Saldo     : Rp$balance")
            println("   Dibutuhkan: Rp$amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("🔄 Top-Up berhasil!")
        println("   Akun       : $accountName")
        println("   Top-Up     : Rp$amount")
        println("   Saldo Baru : Rp$balance")
    }
}