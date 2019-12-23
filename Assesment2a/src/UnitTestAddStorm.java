import static org.junit.jupiter.api.Assertions.*;

class UnitTestAddStorm
{
    Storm storm;
    Storm hurricane = new Huricane();

    @org.junit.jupiter.api.Test
    void addStormHurricane()
    {
        storm.setStormName("Burtha");
        storm.setStormType("Hurricane");
        storm.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        assertEquals(true, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }

    @org.junit.jupiter.api.Test
    void addStormHurricaneSameKey()
    {

        storm.setStormName("Burtha");
        storm.setStormType("Hurricane");
        storm.setWindSpeed(45);

        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();
        stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane);

        storm.setStormName("Burtha");
        storm.setStormType("Hurricane");
        storm.setWindSpeed(67);


        assertEquals(false, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }

    @org.junit.jupiter.api.Test
    void addStormHurricaneMaxCapacity()
    {
        StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();

        for(int i =0; i<20; i++)
        {
            storm.setStormName("Burtha" + i);
            storm.setStormType("Hurricane");
            storm.setWindSpeed(45);
            stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane);
        }

        assertEquals(false, stormAdviceCentre.AddStorm(stormAdviceCentre, hurricane));
    }
}