import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestTornadoAdviceFromCentre
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

    @Test
    void AdviceF1()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(75);
        tornado.setClassification("f1");

        assertEquals("Find safe room/shelter, shield yourself from debris", stormAdviceCentre.GetCorrectAdvice(tornado));
    }

    @Test
    void AdviceF2()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(113);
        tornado.setClassification("f2");

        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", stormAdviceCentre.GetCorrectAdvice(tornado));
    }

    @Test
    void AdviceF3()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(158);
        tornado.setClassification("f3");

        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", stormAdviceCentre.GetCorrectAdvice(tornado));
    }

    @Test
    void AdviceF4()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(206);
        tornado.setClassification("f4");

        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", stormAdviceCentre.GetCorrectAdvice(tornado));
    }

    @Test
    void AdviceF5()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(261);
        tornado.setClassification("f5");

        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", stormAdviceCentre.GetCorrectAdvice(tornado));
    }

    @Test
    void AdviceAnythingElse()
    {
        tornado.setStormName("testTornado");
        tornado.setWindSpeed(12);
        tornado.setClassification("Unclassified");

        assertEquals("There is no need to panic", stormAdviceCentre.GetCorrectAdvice(tornado));
    }
}