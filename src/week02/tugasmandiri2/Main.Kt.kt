//package week02.tugasmandiri2
//
//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    print("Masukkan nama Hero: ")
//    val heroName = scanner.nextLine()
//
//    print ("Masukkan base damage hero: ")
//    val baseDamage = scanner.nextInt()
//
//    val hero = Hero(heroName, baseDamage)
//
//    var enemyHP = 100
//
//    println("\n--- Pertarungan Dimulai --- ")
//
//    while (hero.isAlive() && enemyHP > 0) {
//        println("\nMenu:")
//        println("1. Serang")
//        println("2. Kabur")
//        println("Pilihan: ")
//        val choice = scanner.nextInt()
//
//        if (choice == 1) {
//            hero.attack("Musuh")
//            enemyHP -= hero.baseDamage
//            if (enemyHP < 0 ) enemyHP = 0
//            println("HP Musuh tersisa:  $enemyHP")
//
//            if (enemyHP > 0) {
//                val enemyDamage = (10..20).random()
//                println("Musuh menyerang balik dengan damage $enemyDamage!")
//                hero.takeDamage(enemyDamage)
//                println("HP $hero{hero.name} tersisa: ${hero.hp}")
//            }
//        }else if (choice == 2) {
//            println("${hero.name} memilih kabur dari pertarungan!")
//            break
//        } else {
//            println("Pilihan tidak valid.")
//        }
//
//    }
//
//    println("\n--- Pertarungan Selesai ---- ")
//    if (hero.isAlive() && enemyHP < 0) {
//        println("${hero.name} menang!")
//    } else if (!hero.isAlive() && enemyHP > 0 ) {
//        println("Musuh Menang !")
//    }else {
//        println("Pertarungan berakhir tanpa pemenang. ")
//    }
//}