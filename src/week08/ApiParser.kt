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