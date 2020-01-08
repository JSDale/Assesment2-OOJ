import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestSetValuesOfStorm
{
    Blizzard blizzard = new Blizzard();
    CreateStorm createStorm = new CreateStorm();

    @Test
    void populateStormVariables()
    {
        createStorm.PopulateStormVariables("344", "test", "Blizzard",
                "-12", blizzard);

        assertEquals(344, blizzard.getWindSpeed());
        assertEquals("test", blizzard.getStormName());
        assertEquals("Blizzard", blizzard.getStormType());
        assertEquals(-12, blizzard.getTemp());
    }

    @Test
    void populateStormVariablesWithNonInt()
    {
        createStorm.PopulateStormVariables("g", "test", "Blizzard",
                "-g", blizzard);

        assertEquals(false, Resources.windSpeedIsInt);
        assertEquals(false, Resources.tempIsInt);
    }
}