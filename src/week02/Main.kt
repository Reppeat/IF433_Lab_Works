package week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- Aplikasi PMB ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length !=5){
        println("Error: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan jurusan:")
        val major = scanner.nextLine()

        val s1 = Student(name, major, nim)
        println("Status: Pendaftara Selesai !! ")
    }
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type ==1) {
        print("Masukkan Jurusan:")
        val major = scanner.nextLine()

        val s1 = Student(name, major, nim)
        println("Terdaffar di: ${s1.major} dengan GPA awal  ${s1.gpa}")
    } else if (type ==2) {
        val s2 = Student(name,nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}