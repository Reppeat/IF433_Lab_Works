package week03.tugasMandiri1

fun main() {
    val sword = Weapon("Excalibur")

    sword.damage = -50
    println("Damage sekarang: ${sword.damage} | Tier: ${sword.tier}")

    sword.damage = 9999
    println("Damage sekarang: ${sword.damage} | Tier: ${sword.tier}")

    sword.damage = 650
    println("Damage sekarang: ${sword.damage} | Tier: ${sword.tier}")
}