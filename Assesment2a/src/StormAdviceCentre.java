import java.util.HashMap;

public class StormAdviceCentre
{
    public Storm storm;
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
        else if(Storm.getStormType() == "Tornado")
        {
            Storm.setAdvice(tornado.GetAdvice(tornado.GetClassification()));
        }

        return Storm.getAdvice();
    }

    public boolean AddStorm(StormAdviceCentre stormAdviceCentre, Storm storm)
    {
        if(stormAdviceCentre.storedStorm.size() <20)
        {
                if(storedStorm.containsKey(Storm.getStormName()) == false)
                {
                    stormAdviceCentre.storedStorm.put(Storm.getStormName(), storm);
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
        if (storedStorm.containsKey(Storm.getStormName()) == true)
        {
           // Storm.setStormType(storedStorm.get(Storm.getStormType().toString()));
        }


        return false;
    }

}
