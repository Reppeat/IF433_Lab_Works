package week07

object DatabaseManager {
    var ConnectionStatus : String = "Disconnected"

    fun connect() {
        ConnectionStatus = "Connected to Server"
        println("Database is ready")
    }
}