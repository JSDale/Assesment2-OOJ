import static org.junit.jupiter.api.Assertions.*;

class UnitTestAddStorm
{

    @org.junit.jupiter.api.Test
    void addStormHurricane()
    {
        Storm hurricane = new Huricane();
        Storm.setStormName("Burtha");
        Storm.setStormType("Hurricane");
        Storm.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        assertEquals(true, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }

    @org.junit.jupiter.api.Test
    void addStormHurricaneSameKey()
    {
        Storm hurricane = new Huricane();
        Storm.setStormName("Burtha");
        Storm.setStormType("Hurricane");
        Storm.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();
        stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane);

        Storm.setStormName("Burtha");
        Storm.setStormType("Hurricane");
        Storm.setWindSpeed(67);


        assertEquals(false, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }
}