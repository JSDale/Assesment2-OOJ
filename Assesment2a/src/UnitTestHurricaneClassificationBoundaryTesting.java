import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestHurricaneClassificationBoundaryTesting
{

    Storm hurricane = new Huricane();

    @Test
    void ClassificationTropicalDepressionTopBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(38);

        assertEquals("Tropical Depression", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationTropicalDepressionBottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(25);

        assertEquals("Tropical Depression", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationTropicalStormBottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(39);

        assertEquals("Tropical Storm", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationTropicalStormTopBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(73);

        assertEquals("Tropical Storm", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat1BottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(74);

        assertEquals("Category 1", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat1TopBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(95);

        assertEquals("Category 1", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat2BottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(96);

        assertEquals("Category 2", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat2TopBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(110);

        assertEquals("Category 2", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat3BottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(111);

        assertEquals("Category 3", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat3TopBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(129);

        assertEquals("Category 3", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat4BottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(130);

        assertEquals("Category 4", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat4TopBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(156);

        assertEquals("Category 4", hurricane.RetrieveClassification());
    }

    @Test
    void ClassificationCat5BottomBoundary()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(157);

        assertEquals("Category 5", hurricane.RetrieveClassification());
    }
}