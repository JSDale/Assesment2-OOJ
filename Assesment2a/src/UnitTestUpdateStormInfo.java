import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class UnitTestUpdateStormInfo
{
    private Storm tornado = new Tornado();
    private StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

    @Test
    void getStormInfo()
    {
        tornado.setStormType("Tornado");
        tornado.setStormName("test");
        tornado.setWindSpeed(67);

        assumeTrue(stormAdviceCentre.AddStorm(tornado));

        assertEquals(true, stormAdviceCentre.GetStormInfo("test"));
    }

    @Test
    void updateStormData()
    {
        tornado.setStormType("Tornado");
        tornado.setStormName("test");
        tornado.setWindSpeed(67);

        assumeTrue(stormAdviceCentre.AddStorm(tornado));

        Storm temporaryStorm = stormAdviceCentre.storedStorm.get("test");

        tornado.setWindSpeed(34);

        assertEquals(true, stormAdviceCentre.UpdateStormData("test", tornado));
        assertEquals(34, temporaryStorm.getWindSpeed());
    }

    @Test
    void UpdateNonExistentStorm()
    {
        assertEquals(false, stormAdviceCentre.UpdateStormData("test", tornado));
    }

    @Test
    void GetInfoOfNonExistentStorm()
    {
        assertEquals(false, stormAdviceCentre.GetStormInfo("test"));
    }
}