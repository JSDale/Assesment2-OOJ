import java.util.HashMap;

public class StormAdviceCentre
{
    public HashMap<String, Storm> storedStorm = new HashMap<String, Storm>();

    public String GetCorrectAdvice(Huricane hurricane)
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
            return true;
        }
        else
        {
            return false;
        }

    }
}
