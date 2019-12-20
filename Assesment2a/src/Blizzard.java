public class Blizzard extends Storm
{

    @Override
    public String GetClassification()
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
        }
        return advice = "nothing to advise";
    }
}
