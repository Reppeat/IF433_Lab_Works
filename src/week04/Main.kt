package week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(brand = "Tesla", 4, batteryCapacity = 98)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Employee Hierarchy ---")
    val manager = Manager(name = "Agus", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    val developer = Developer(name = "Ani", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}