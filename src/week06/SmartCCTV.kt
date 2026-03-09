package week06

// SmartCCTV mewarisi SmartDevice, Switchable, DAN Recordable (Compound Capabilities)
class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name'MENYALA")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' MATI.")
    }

    override fun startRecord() {
        println("CCTV '$name' MEREKAM ")
    }
}