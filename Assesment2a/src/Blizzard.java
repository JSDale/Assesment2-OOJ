public class Blizzard extends Storm
{
    public Blizzard()
    {
        stormName = getStormName();
        stormType = getStormType();
        windSpeed = getWindSpeed();
        temp = getTemp();
        classification = getClassification();
        advice = getAdvice();
    }

    @Override
    public String RetrieveClassification()
    {
        if(windSpeed <35)
        {
            classification = "snow storm";
        }
        else if (windSpeed >= 35 && windSpeed <= 44)
        {
            classification = "blizzard";
        }
        else if (windSpeed >= 45 && temp >=-11)
        {
            classification = "blizzard";
        }
        else if (windSpeed >= 45 && temp <= -12)
        {
            classification = "severe blizzard";
        }
        return classification;
    }

    @Override
    public String GetAdvice(String classification)
    {
        switch (classification)
        {
            case "snow storm":
                advice = "Take care and avoid travel if possible";
                return advice;
            case "blizzard":
                advice = "Keep warm, Do not travel unless absolutely essential";
                return advice;
            case "severe blizzard":
                advice = "Keep warm, avoid all travel";
                return advice;
        }
        return advice = "nothing to advise";
    }
}
