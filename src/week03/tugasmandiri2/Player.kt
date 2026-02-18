package week03.tugasmandiri2

class Player {
    class Player(val username: String) {
        private var xp: Int = 0
        val level: Int
            get() = (xp / 100) + 1
        fun addXp(amount: Int) {
            if (amount <= 0) {
                println("⚠️ WARNING: XP yang ditambahkan harus positif!")
                return
            }
            val levelSebelum = level    // simpan level sebelum XP ditambah
            xp += amount
            val levelSesudah = level    // hitung level setelah XP ditambah

            println("✅ +$amount XP diterima. Total XP: $xp | Level: $levelSesudah")

            if (levelSesudah > levelSebelum) {
                println("🎉 Level Up! Selamat $username naik ke level $levelSesudah!")
            }
        }
    }
}