import java.util.HashMap;

public class StormAdviceCentre
{
    public Storm storm;
    public HashMap<String, Storm> storedStorm = new HashMap<String, Storm>();

    public String GetCorrectAdvice(Storm hurricane, Storm tornado, Storm blizzard)
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

    public boolean GetStormInfo()
    {
        if (storedStorm.containsKey(storm.getStormName()) == true)
        {
           // Storm.setStormType(storedStorm.get(Storm.getStormType().toString()));
        }


        return false;
    }

}
