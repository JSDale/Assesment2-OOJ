import static org.junit.jupiter.api.Assertions.*;

class UnitTestAddStorm
{

    Storm hurricane = new Huricane();
    Storm tornado = new Tornado();
    Storm blizzard = new Blizzard();

    @org.junit.jupiter.api.Test
    void addStormHurricane()
    {
        Storm.setStormName("Burtha");
        Storm.setStormType("Hurricane");
        Storm.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        assertEquals(true, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }

    @org.junit.jupiter.api.Test
    void addStormHurricaneSameKey()
    {

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

    @org.junit.jupiter.api.Test
    void addStormHurricaneMaxCapacity()
    {
        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        for(int i =0; i<20; i++)
        {
            Storm.setStormName("Burtha" + i);
            Storm.setStormType("Hurricane");
            Storm.setWindSpeed(45);
            stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane);
        }

        assertEquals(false, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }
}