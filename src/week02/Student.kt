package week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di memory")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, major="Non-Matriculated") {
        println("LOG: Menggunakan construcotr jalur umum (Tanpa Jurusan")
    }
}
