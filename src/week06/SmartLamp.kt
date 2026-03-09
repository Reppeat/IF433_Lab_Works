package week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("💡 Lampu '$name' MENYALA. Ruangan menjadi terang!")
    }

    override fun turnOff() {
        println("🌑 Lampu '$name' MATI. Ruang menjadi gelap.")
    }
}