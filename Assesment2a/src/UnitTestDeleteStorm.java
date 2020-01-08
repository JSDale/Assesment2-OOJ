import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class UnitTestDeleteStorm
{
    StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

    @Test
    void deleteAStorm()
    {
        Storm hurricane = new Huricane();
        hurricane.setStormName("test");
        hurricane.setWindSpeed(34);
        hurricane.setStormType("Hurricane");

        assumeTrue(stormAdviceCentre.AddStorm(hurricane));

        assertEquals(true, stormAdviceCentre.DeleteAStorm("test"));

    }

    @Test
    void DeleteNonExistentStorm()
    {
        assertEquals(false, stormAdviceCentre.DeleteAStorm("test"));
    }
}