package week03.tugasMandiri1

class Weapon(val name: String) {

    // ✅ Custom Setter dengan dua aturan validasi
    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    // Aturan 1: damage negatif → tolak, nilai TIDAK berubah
                    println("⚠️ WARNING: Damage tidak boleh negatif! Nilai tetap $field.")
                    // Tidak assign apapun ke field → nilai lama tetap terjaga
                }
                value > 1000 -> {
                    // Aturan 2: damage > 1000 (Overpowered) → paksa jadi 1000
                    println("⚠️ WARNING: Damage terlalu tinggi (OP)! Di-set ke maksimum 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    // ✅ Computed Property - tier dihitung dari nilai damage saat ini
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else         -> "Common"
        }
}