package week03.tugasmandiri2

fun main() {
    val player = Player("Andi")

    // player.xp = 999  // ← coba uncomment, pasti ERROR (private!)

    player.addXp(50)    // Total XP: 50, masih Level 1
    player.addXp(60)    // Total XP: 110, Level Up ke Level 2!
    player.addXp(200)   // Total XP: 310, Level Up ke Level 4!
}