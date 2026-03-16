package week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.ConnectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}