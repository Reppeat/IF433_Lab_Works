package week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK" , coinRepo.getAll())

    println("Status: ${response.status}")
    println("=== Coin List ===")
    response.data.forEach {
        println("Coin: ${it.name}, Balance : ${it.balance}")
    }

    println("\n=== Search 'BTC' ===")
3
        val searchResult = coinRepo.searchByName("BTC")
    searchResult.forEach {
        println("Found: ${(it as Coin).name}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 100.0))
    txRepo.add(Transaction("TX002", 250.5))
    txRepo.add(Transaction("TX003", 500.0))

    println("\n=== Transaction List ===")
    txRepo.getAll().forEach {
        println("Transaction ID: ${it.id}, Amount: ${it.amount}")
    }
}