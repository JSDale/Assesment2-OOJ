import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestTornadoAdvice
{
    StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();
    Storm tornado = new Tornado();

    @Test
    void AdviceF0()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(71);
        tornado.setClassification("f0");

        assertEquals(stormAdviceCentre.GetCorrectAdvice(tornado), "Find safe room/shelter, shield yourself from debris");
    }
}