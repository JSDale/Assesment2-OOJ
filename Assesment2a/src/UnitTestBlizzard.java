import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestBlizzard
{

    @Test
    void SnowStormClassification()
    {
        Storm blizzard = new Blizzard();
        Storm.setStormName("Burtha");
        Storm.setStormType("Blizzard");
        Storm.setWindSpeed(34);
        Storm.setTemp(-50);
        blizzard.GetClassification();

        assertEquals("snow storm", Storm.getClassification());
    }
    @Test
    void BlizzardClassification_WindSpeedBetween35And45()
    {
        Storm blizzard = new Blizzard();
        Storm.setStormName("Burtha");
        Storm.setStormType("Blizzard");
        Storm.setWindSpeed(39);
        Storm.setTemp(-50);
        blizzard.GetClassification();

        assertEquals("blizzard", Storm.getClassification());
    }

    @Test
    void BlizzardClassification_WindSpeedGreaterThan45TempGreaterThanMinus12()
    {
        Storm blizzard = new Blizzard();
        Storm.setStormName("Burtha");
        Storm.setStormType("Blizzard");
        Storm.setWindSpeed(55);
        Storm.setTemp(-11);
        blizzard.GetClassification();

        assertEquals("blizzard", Storm.getClassification());
    }

    @Test
    void SevereBlizzardClassification()
    {
        Storm blizzard = new Blizzard();
        Storm.setStormName("Burtha");
        Storm.setStormType("Blizzard");
        Storm.setWindSpeed(45);
        Storm.setTemp(-12);
        blizzard.GetClassification();

        assertEquals("severe blizzard", Storm.getClassification());
    }
}