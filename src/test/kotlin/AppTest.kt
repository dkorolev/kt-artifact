import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun twoTimesTwo() = assertEquals(4, mulTwoIntegersArtifactEnterpriseEdition(2, 2))

    @Test
    fun twoTimesThree() = assertEquals(6, mulTwoIntegersArtifactEnterpriseEdition(2, 3))

    @Test
    fun threeTimesThree() = assertEquals(9, mulTwoIntegersArtifactEnterpriseEdition(3, 3))
}
