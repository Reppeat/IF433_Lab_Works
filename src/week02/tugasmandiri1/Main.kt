package week02.tugasmandiri1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Judul Buku:")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Input lama pinjaman tidak valid")
        duration = 1

    }

    val loan = Loan(title, borrower, duration)
    println("\n --- Detail Peminjaman ---")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjaman : ${loan.borrower}")
    println("Durasi pinjaman : ${loan.loanDuration}")
    println("Total Denda : Rp ${loan.calculateFine()}")
}