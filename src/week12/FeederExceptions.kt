package week12

sealed class FeederException(msg: String) : Exception(msg)

class InvalidFoodException :
    FeederException("Makanan tidak valid untuk feeder.")

class EmptyContainerException :
    FeederException("Container makanan kosong.")

class OverfeedingException :
    FeederException("Porsi makan melebihi batas.")