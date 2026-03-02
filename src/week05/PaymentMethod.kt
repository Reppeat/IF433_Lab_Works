package week05

class PaymentMethod {
    abstract class PaymentMethod(val accountName: String) {

        abstract fun processPayment(amount: Double)
    }
}