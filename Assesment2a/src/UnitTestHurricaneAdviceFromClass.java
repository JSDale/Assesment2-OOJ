import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestHurricaneAdviceFromClass
{
    Storm hurricane = new Huricane();

    @Test
    void AdviceTropicalDep()
    {
        assertEquals("Prepare for a possible Hurricane", hurricane.GetAdvice("Tropical Depression"));
    }

    @Test
    void AdviceTropicalStorm()
    {
        assertEquals("Close storm shutters and stay away from windows", hurricane.GetAdvice("Tropical Storm"));
    }

    @Test
    void AdviceCat1()
    {
        assertEquals("Close storm shutters and stay away from windows", hurricane.GetAdvice("Category 1"));
    }

    @Test
    void AdviceCat2()
    {
        assertEquals("Close storm shutters and stay away from windows", hurricane.GetAdvice("Category 2"));
    }

    @Test
    void AdviceCat3()
    {
        assertEquals("Coastal regions are encouraged to evacuate", hurricane.GetAdvice("Category 3"));
    }

    @Test
    void AdviceCat4()
    {
        assertEquals("Evacuate", hurricane.GetAdvice("Category 4"));
    }

    @Test
    void AdviceCat5()
    {
        assertEquals("Evacuate", hurricane.GetAdvice("Category 5"));
    }
}