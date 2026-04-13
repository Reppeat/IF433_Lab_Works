package week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? =
        if (id == 1) UserProfile("TestUser", "test@test.com") else null
}
fun runMockUnitTest() {
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T") { "Test Failed!" }
    println("Test Passed: Initial is T")
}