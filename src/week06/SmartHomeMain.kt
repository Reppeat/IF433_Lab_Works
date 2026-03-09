package week06

fun main() {

    println("═══════════════════════════════════════════")
    println("       SMART HOME SYSTEM       ")
    println("═══════════════════════════════════════════\n")

    val lamp    = SmartLamp(id = "LAMP-001",    name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPKR-001", name = "Google Nest Dapur")
    val cctv    = SmartCCTV(id = "CCTV-001",    name = "Ezviz Garasi")


    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n───────────────────────────────────────────")
    println(" Total perangkat terdaftar: ${hub.devices.size}")
    println("───────────────────────────────────────────")
    for (device in hub.devices) {
        println("  • [${device.id}] ${device.name}")
    }
}