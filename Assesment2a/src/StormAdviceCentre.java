import java.util.HashMap;

public class StormAdviceCentre
{
    public HashMap<String, Storm> storedStorm = new HashMap<String, Storm>();

    public String GetCorrectAdvice( Storm storm)
    {
        String advice = "No advice to display.";
        storm.setAdvice(advice);

        storm.setAdvice(storm.GetAdvice(storm.RetrieveClassification()));

        return storm.getAdvice();
    }

    public boolean AddStorm(Storm storm)
    {
                if(storedStorm.containsKey(storm.getStormName()) == false)
                {
                    storedStorm.put(storm.getStormName(), storm);
                    return true;
                }
                return false;
    }

    public boolean GetStormInfo(String stormName)
    {
        if (storedStorm.containsKey(stormName) == true)
        {
           Storm tempStorm = storedStorm.get(stormName);
           Resources.tempStormType = tempStorm.getStormType();
           Resources.tempStormWindSpeed = tempStorm.getWindSpeed();

           if(tempStorm.getStormType() == "Blizzard")
           {
               Resources.tempStormTemp = tempStorm.getTemp();
           }
            return true;
        }
        return false;
    }

    public boolean UpdateStormData(String stormName, Storm storm)
    {
        if (storedStorm.containsKey(stormName))
        {
            Resources.stormUpdated = true;
            storedStorm.put(stormName, storm);
            return true;
        }
        else {return false; }
    }

    public boolean DeleteAStorm(String stormName)
    {
        if (storedStorm.containsKey(stormName) == true)
        {
            storedStorm.remove(stormName);
            return true;
        }
        else
        {
            return false;
        }

    }

}
