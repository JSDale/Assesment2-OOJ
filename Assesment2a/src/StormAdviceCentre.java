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

    public boolean AddStorm(StormAdviceCentre stormAdviceCentre, Storm storm)
    {
                if(storedStorm.containsKey(storm.getStormName()) == false)
                {
                    stormAdviceCentre.storedStorm.put(storm.getStormName(), storm);
                    System.out.println(storedStorm.get(storm.getStormName()));
                    return true;
                }

                System.out.println("Storm Already Exists");
                return false;
    }

    public boolean GetStormInfo(String stormName)
    {
        if (storedStorm.containsKey(stormName) == true)
        {
           Storm tempStorm = storedStorm.get(stormName);
           Resources.stormType = tempStorm.getStormType();
           Resources.stormWindSpeed = tempStorm.getWindSpeed();

           if(tempStorm.getStormType() == "Blizzard")
           {
               Resources.stormTemp = tempStorm.getTemp();
           }
            return true;
        }
        return false;
    }

    public void UpdateStormData(String stormName, Storm storm)
    {
        if (storedStorm.containsKey(stormName))
        {
            Resources.stormUpdated = true;
            storedStorm.put(stormName, storm);
        }
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
