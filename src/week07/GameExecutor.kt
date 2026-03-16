package week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("⚔️ Kamu bertemu monster: ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Loot didapat: ${item.name} (Damage: ${item.damage}, Rarity: ${item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Permainan berakhir. Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Istirahat sejenak...")
        }
    }
}