package week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(
    requested: Int,
    available: Int
) : FeederException(
    "Kibble tidak cukup! Diminta $requested gr, sisa $available gr"
)

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!")

class InvalidFoodException :
    FeederException("Makanan tidak valid untuk feeder.")

class EmptyContainerException :
    FeederException("Container makanan kosong.")

class OverfeedingException :
    FeederException("Porsi makan melebihi batas.")

