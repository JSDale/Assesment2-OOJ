import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestTornadoClassificationBoundaryTesting
{

    Storm tornado = new Tornado();

    @Test
    void ClassificationF0BottomBoundary()
    {
        tornado.setStormName("Burtha");
        String hurricane = "Tornado";
        tornado.setStormType(hurricane);
        tornado.setWindSpeed(40);

        assertEquals("f0", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF0TopBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(72);

        assertEquals("f0", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF1BottomBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(73);

        assertEquals("f1", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF1TopBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(112);

        assertEquals("f1", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF2BottomBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Hurricane");
        tornado.setWindSpeed(113);

        assertEquals("f2", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF2TopBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(157);

        assertEquals("f2", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF3BottomBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(158);

        assertEquals("f3", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF3TopBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(205);

        assertEquals("f3", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF4BottomBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(206);

        assertEquals("f4", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF4TopBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(260);

        assertEquals("f4", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationF5BottomBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(261);

        assertEquals("f5", tornado.RetrieveClassification());
    }

    @Test
    void ClassificationCat5BottomBoundary()
    {
        tornado.setStormName("Burtha");
        tornado.setStormType("Tornado");
        tornado.setWindSpeed(39);

        assertEquals("Unclassified", tornado.RetrieveClassification());
    }
}