import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestHurricaneAdviceFromCentre
{
    StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();
    Storm hurricane = new Huricane();

    @Test
    void AdviceTropDep()
    {
        hurricane.setStormName("testHurricane");
        hurricane.setWindSpeed(26);
        hurricane.setClassification("Tropical Depression");

        assertEquals("Prepare for a possible Hurricane", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceTropStorm()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(73);
        hurricane.setClassification("Tropical Storm");

        assertEquals("Close storm shutters and stay away from windows", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceCat1()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(74);
        hurricane.setClassification("Category 1");

        assertEquals("Close storm shutters and stay away from windows", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceCat2()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(96);
        hurricane.setClassification("Category 2");

        assertEquals("Close storm shutters and stay away from windows", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceCat3()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(111);
        hurricane.setClassification("Category 3");

        assertEquals("Coastal regions are encouraged to evacuate", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceCat4()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(130);
        hurricane.setClassification("Category 4");

        assertEquals("Evacuate", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceCat5()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(157);
        hurricane.setClassification("Category 5");

        assertEquals("Evacuate", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }

    @Test
    void AdviceAnythingElse()
    {
        hurricane.setStormName("testTornado");
        hurricane.setWindSpeed(1);
        hurricane.setClassification("Unclassified");

        assertEquals("No advice to display.", stormAdviceCentre.GetCorrectAdvice(hurricane));
    }
}