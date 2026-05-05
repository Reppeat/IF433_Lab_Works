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
}