package oop_00000068873_GavinPrasetya.week01

fun main() {
    // refactor: gunakan val dan hapus tipe data eksplisit
    val name = "Gavin Prasetya"
    val score = 80

    // string template
    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $studentId")
}

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"
