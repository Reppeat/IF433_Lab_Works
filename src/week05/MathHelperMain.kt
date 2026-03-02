package week05

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(6)
    println("======================================")
    println("  COMPILE TIME POLYMORPHISM")
    println("======================================")
    println()
    println("[1] hitungLuas(sisi = 6)")
    println("    -> Memanggil: hitungLuas(sisi: Int)")
    println("    -> Rumus    : sisi * sisi")
    println("    -> Hasil    : $luasPersegi")
    println()

    val luasPersegiPanjang = math.hitungLuas(8, 5)
    println("[2] hitungLuas(panjang = 8, lebar = 5)")
    println("    -> Memanggil: hitungLuas(panjang: Int, lebar: Int)")
    println("    -> Rumus    : panjang * lebar")
    println("    -> Hasil    : $luasPersegiPanjang")
    println()

    val luasLingkaran = math.hitungLuas(7.0)
    println("[3] hitungLuas(jariJari = 7.0)")
    println("    -> Memanggil: hitungLuas(jariJari: Double)")
    println("    -> Rumus    : 3.14 * jariJari * jariJari")
    println("    -> Hasil    : $luasLingkaran")
    println()
    println("======================================")
    println("  Kotlin memilih metode yang tepat")
    println("  berdasarkan argumen saat COMPILE TIME")
    println("======================================")
}