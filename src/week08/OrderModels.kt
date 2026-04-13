package week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class order (val delivery: DeliveryDetails?, val totalPrice: Int?)