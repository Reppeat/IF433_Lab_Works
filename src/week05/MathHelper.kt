package week05

class MathHelper {
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 7)
    println("Luas Persegi Panjang (panjang=4, lebar=7): $luasPersegi Panjang")

    val luasLingkaran = math.hitungLuas(3.5)
    println("Luas Lingkaran (jariJari=3.5): $luasLingkaran")
}