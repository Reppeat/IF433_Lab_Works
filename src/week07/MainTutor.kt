package week07

fun main() {
    val starterWeapon = Weapon.forgeStarterSword()
    val upgradedItem = starterWeapon.item.copy(
        damage = 25,
        name = "Pedang Kayu + Upgrade"
    )

    println("=== SIMULASI BLACKSMITH ===")
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Rarity: ${starterWeapon.item.rarity}")
    println("Senjata upgrade: ${upgradedItem.name}, Damage: ${upgradedItem.damage}, Rarity: ${upgradedItem.rarity}")

    println("\n=== SIMULASI EVENT ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))

    println("\n=== TEST FACTORY & ENUM ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    println("Senjata Awal: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println("\n=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.ConnectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println("Objek RegularUser: $reg1")
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println("Objek DataUser: $data1")
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)
}
