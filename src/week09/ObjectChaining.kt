package week09

data class Student(val name: String, val gpa: Double)

fun main() {

    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )

    println("=== HONOR STUDENTS PIPELINE ===")

    // Pipeline chaining operations
    val honorNames = students
        .filter { it.gpa >= 3.5 }        // 1. Ambil GPA >= 3.5
        .sortedBy { it.name }           // 2. Urutkan berdasarkan nama
        .map { it.name.uppercase() }    // 3. Ambil nama & uppercase

    honorNames.forEach { println("Honor Roll: $it") }
}