package week08

fun parseProduct(rawJson: Map): Product? {
    val id = requireNotNull(rawJson["id"] as? String) {
        "API Invalid: Missing ID" }
    val name = requireNotNull(rawJson["name"] as? String) {
        "API Invalid: Missing Name" }
    return when (rawJson["type"] as? String) {
        "ELECTRONIC" -> Electronic(id, name,
            rawJson["warranty"] as? Int ?: 12)
        "CLOTHING"   -> Clothing(id, name,
            rawJson["size"] as? String ?: "All Size")
        else -> null
    }
}

fun checkout(product: Product) {
    val id = when (product) {
        is Electronic -> product.id
        is Clothing   -> product.id
    }
    // !! justified: Java service selalu return non-null
    val txId = JavaPaymentService.processPayment(id)!!
    println("Transaction ID: $txId")
}