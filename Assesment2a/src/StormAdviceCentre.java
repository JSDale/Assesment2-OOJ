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
            stormAdviceCentre.storedStorm.put(Storm.getStormName(), storm);
            System.out.println(stormAdviceCentre.storedStorm.get("bob"));
            return true;
        }
        else
        {
            return false;
        }

    }
}
