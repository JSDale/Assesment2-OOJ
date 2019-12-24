import static org.junit.jupiter.api.Assertions.*;

class UnitTestAddStorm
{
    //Storm hurricane;
    Storm hurricane = new Huricane();

    @org.junit.jupiter.api.Test
    void addStormHurricane()
    {
        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        assertEquals(true, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }

    @org.junit.jupiter.api.Test
    void addStormHurricaneSameKey()
    {

        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();
        stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane);

        hurricane.setStormName("Burtha");
        hurricane.setStormType("Hurricane");
        hurricane.setWindSpeed(67);


        assertEquals(false, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }

    @org.junit.jupiter.api.Test
    void addStormHurricaneMaxCapacity()
    {
        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        for(int i =0; i<2000; i++)
        {
            hurricane.setStormName("Burtha" + i);
            hurricane.setStormType("Hurricane");
            hurricane.setWindSpeed(45);
            stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane);
        }

        assertEquals(false, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }
}