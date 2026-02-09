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
        println("Status: Pendaftara Selesai ")
    }
}