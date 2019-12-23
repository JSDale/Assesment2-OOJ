import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestBlizzardClassificationTesting
{
    Storm blizzard = new Blizzard();

    @Test
    void ClassificationBlizzardBottomBoundary()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(35);
        blizzard.setTemp(344);

        assertEquals("blizzard", blizzard.RetrieveClassification());
    }

    @Test
    void ClassificationBlizzardTopBoundary()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(45);
        blizzard.setTemp(-11);

        assertEquals("blizzard", blizzard.RetrieveClassification());
    }

    @Test
    void ClassificationBlizzardLogic()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(405);
        blizzard.setTemp(-11);

        assertEquals("blizzard", blizzard.RetrieveClassification());
    }

    @Test
    void ClassificationSevereBlizzardBottomBoundary()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(45);
        blizzard.setTemp(-12);

        assertEquals("severe blizzard", blizzard.RetrieveClassification());
    }

    @Test
    void ClassificationSevereBlizzardTopBoundary()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(67777);
        blizzard.setTemp(-120);

        assertEquals("severe blizzard", blizzard.RetrieveClassification());
    }

    @Test
    void ClassificationSnowStormBottomBoundary()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(0);
        blizzard.setTemp(344);

        assertEquals("snow storm", blizzard.RetrieveClassification());
    }

    @Test
    void ClassificationSnowStormTopBoundary()
    {
        blizzard.setStormName("Burtha");
        blizzard.setStormType("Blizzard");
        blizzard.setWindSpeed(34);
        blizzard.setTemp(-45);

        assertEquals("snow storm", blizzard.RetrieveClassification());
    }
}