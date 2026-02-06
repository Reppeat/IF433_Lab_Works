package oop_00000068873_GavinPrasetya.week01

fun main() {
    //refactor: gunakan val dan hapus tipe data eksplisit
    val name: String = "Gavin Prasetya"
    val score: Int =  80

    //refactor string template ($name)
    println("Nama:  $name, Nilai: $score")

    val grade = when (score) {
        in 90 < 100 -> "A"
        in 80 < 89 -> "B"
        in 80 < 79 -> "C"
        else -> "D"

    println("Grade kamu:  $grade")
    }
}