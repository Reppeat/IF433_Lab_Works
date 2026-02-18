package week03.tugasmandiri2

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus positif!")
            return
        }
        val levelSebelum = level
        xp += amount
        val levelSesudah = level
        println("✅ +$amount XP diterima. Total XP: $xp | Level: $levelSesudah")
        if (levelSesudah > levelSebelum) {
            println(" Selamat $username naik ke level $levelSesudah!")
        }
    }
}