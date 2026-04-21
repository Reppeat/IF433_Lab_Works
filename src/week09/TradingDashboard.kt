package week09

fun main() {

    // CHECKPOINT 11: Data uji
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 8.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 0.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 3.5, "OPEN"),
        TradeLog("XRPUSDT", "SHORT", 5, -2.5, "OPEN")
    )

    // CHECKPOINT 12: Filter CLOSED
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    // CHECKPOINT 13: Winning trades (roe > 0)
    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    // CHECKPOINT 14: Losing trades (roe <= 0)
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    // CHECKPOINT 15: Top performers
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // CHECKPOINT 16: Worst performers
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // CHECKPOINT 17: Unique pairs
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    // CHECKPOINT 18: Print dashboard header + WIN
    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS ---")
    topPerformersString.forEach { println(it) }

    // CHECKPOINT 19: Print LOSS + PAIRS
    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- TRADED PAIRS ---")
    uniquePairs.forEach { println(it) }
}