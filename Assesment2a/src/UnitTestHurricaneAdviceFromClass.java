import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestHurricaneAdviceFromClass
{
    Storm hurricane = new Huricane();

    @Test
    void AdviceCat5()
    {
        hurricane.setStormName("testTornado");
        hurricane.setClassification("Category 5");

        assertEquals("Evacuate", hurricane.GetAdvice("Category 5"));
    }
}