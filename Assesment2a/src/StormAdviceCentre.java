import java.util.HashMap;

public class StormAdviceCentre
{
    public HashMap<String, Storm> storedStorm = new HashMap<String, Storm>();

    public String GetCorrectAdvice(Storm hurricane, Storm tornado, Storm blizzard, Storm storm)
    {
        String advice = "No advice to display.";
        storm.setAdvice(advice);

        if (storm.getStormType() == "Hurricane")
        {
            storm.setAdvice(hurricane.GetAdvice(hurricane.GetClassification()));
        }
        else if(storm.getStormType() == "Blizzard")
        {
            storm.setAdvice(blizzard.GetAdvice(blizzard.GetClassification()));
        }
        else if(storm.getStormType() == "Tornado")
        {
            storm.setAdvice(tornado.GetAdvice(tornado.GetClassification()));
        }

        return storm.getAdvice();
    }

    public boolean AddStorm(StormAdviceCentre stormAdviceCentre, Storm storm)
    {
        if(stormAdviceCentre.storedStorm.size() <20)
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
        return false;
    }

    public boolean GetStormInfo(Storm storm, String stormName)
    {
        if (storedStorm.containsKey(stormName) == true)
        {
           Storm tempStorm = storedStorm.get(stormName);
           StormFields.stormType = tempStorm.getStormType();
           StormFields.stormWindSpeed = tempStorm.getWindSpeed();

           if(storm.getStormType() == "Blizzard")
           {
               StormFields.stormTemp = tempStorm.getTemp();
           }
            return true;
        }

        return false;
    }

}
