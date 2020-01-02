import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestBlizzardAdviceFromClass
{
    Storm blizzard = new Blizzard();

    @Test
    void AdviceUnclassified()
    {
        assertEquals("Try to stay off roads and prepare for a storm", blizzard.GetAdvice("unclassified"));
    }

    @Test
    void AdviceSnowStorm()
    {
        assertEquals("Take care and avoid travel if possible", blizzard.GetAdvice("snow storm"));
    }

    @Test
    void AdviceBlizzard()
    {
        assertEquals("Keep warm, Do not travel unless absolutely essential", blizzard.GetAdvice("blizzard"));
    }

    @Test
    void AdviceSevereBlizzard()
    {
        assertEquals("Keep warm, avoid all travel", blizzard.GetAdvice("severe blizzard"));
    }
}