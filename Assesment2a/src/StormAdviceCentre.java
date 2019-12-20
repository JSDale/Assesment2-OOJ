import java.util.HashMap;

public class StormAdviceCentre
{
    public HashMap<String, Storm> storedStorm = new HashMap<String, Storm>();

    public String GetCorrectAdvice(Storm hurricane, Storm tornado, Storm blizzard)
    {
        String advice = "No advice to display.";
        Storm.setAdvice(advice);

        if (Storm.getStormType() == "Hurricane")
        {
            Storm.setAdvice(hurricane.GetAdvice(hurricane.GetClassification()));
        }
        else if(Storm.getStormType() == "Blizzard")
        {
            Storm.setAdvice(blizzard.GetAdvice(blizzard.GetClassification()));
        }

        return Storm.getAdvice();
    }

    public boolean AddStorm(StormAdviceCentre stormAdviceCentre, Storm storm)
    {
        if(stormAdviceCentre.storedStorm.size() <20)
        {
                if(storedStorm.containsKey(storm.getStormName()) == false)
                {
                    stormAdviceCentre.storedStorm.put(Storm.getStormName(), storm);
                    System.out.println(storedStorm.get(storm.getStormName()).ToString());
                    return true;
                }

                System.out.println("Storm Already Exists");
                return false;
        }
        return false;
    }

    public boolean EditStorm()
    {

        return false;
    }
}
