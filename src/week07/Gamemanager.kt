package week07

object GameManager {
    private var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("⚠️ Game sudah berjalan! Mencegah instansiasi ganda.")
            return
        }

        isGameRunning = true
        println("🚀 Memulai Game Engine...")
    }
}
