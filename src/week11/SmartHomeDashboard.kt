package week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    homeDevices.add(SmartDevice("Lampu Ruang Tamu", "Lighting", true, 10))
    homeDevices.add(SmartDevice("AC Kamar", "Cooling", false, 350))
    println("=== DAFTAR PERANGKAT ===")
    homeDevices.forEach {
        println(it.diagnose())
    }
    val lamp = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)
    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }
    with(homeDevices) {
        println("=== RINGKASAN PERANGKAT ===")
        println("Total perangkat: $size")
    }

}