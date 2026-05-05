package week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    homeDevices.add(SmartDevice("Lampu Ruang Tamu", "Lighting", true, 10))
    homeDevices.add(SmartDevice("AC Kamar", "Cooling", false, 350))
    println("=== DAFTAR PERANGKAT ===")
    homeDevices.forEach {
        println(it.diagnose())
    }
}