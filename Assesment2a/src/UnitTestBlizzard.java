import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestBlizzard
{

    Storm storm;

    @Test
    void SnowStormClassification()
    {
        Storm blizzard = new Blizzard();
        storm.setStormName("Burtha");
        storm.setStormType("Blizzard");
        storm.setWindSpeed(34);
        storm.setTemp(-50);
        blizzard.GetClassification();

        assertEquals("snow storm", storm.getClassification());
    }
    @Test
    void BlizzardClassification_WindSpeedBetween35And45()
    {
        Storm blizzard = new Blizzard();
        storm.setStormName("Burtha");
        storm.setStormType("Blizzard");
        storm.setWindSpeed(39);
        storm.setTemp(-50);
        blizzard.GetClassification();

        assertEquals("blizzard", storm.getClassification());
    }

    @Test
    void BlizzardClassification_WindSpeedGreaterThan45TempGreaterThanMinus12()
    {
        Storm blizzard = new Blizzard();
        storm.setStormName("Burtha");
        storm.setStormType("Blizzard");
        storm.setWindSpeed(55);
        storm.setTemp(-11);
        blizzard.GetClassification();

        assertEquals("blizzard", storm.getClassification());
    }

    @Test
    void SevereBlizzardClassification()
    {
        Storm blizzard = new Blizzard();
        storm.setStormName("Burtha");
        storm.setStormType("Blizzard");
        storm.setWindSpeed(45);
        storm.setTemp(-12);
        blizzard.GetClassification();

        assertEquals("severe blizzard", storm.getClassification());
    }
}