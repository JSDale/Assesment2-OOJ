import java.util.HashMap;

public class StormAdviceCentre
{
    public HashMap<String, Storm> storedStorm = new HashMap<String, Storm>();

    public String GetCorrectAdvice(Storm hurricane, Storm Tornado, Storm Blizzard)
    {
        String advice = "No advice to display.";
        Storm.setAdvice(advice);

        if (Storm.getStormType() == "Hurricane")
        {
            Storm.setAdvice(hurricane.GetAdvice(hurricane.GetClassification()));
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
        for (int i = 0; i < storedStorm.size(); i++)
        {

        }
        return false;
    }
}
