package week06

class Smartphone : Camera, Phone {

    override fun turnOn() {
        super<Camera>.turnOn()  // Panggil turnOn() milik Camera
        super<Phone>.turnOn()   // Panggil turnOn() milik Phone
        println("Sistem operasi smartphone berhasil booting.")
    }
}