public class Tornado extends Storm
{
    public Tornado()
    {

    }

    @Override
    public String GetClassification()
    {
        if (windSpeed >=40 && windSpeed <=72)
        {
            classification = "f0";
        }
        else if (windSpeed >=73 && windSpeed <=112)
        {
            classification = "f1";
        }
        else if (windSpeed >=113 && windSpeed <=157)
        {
            classification = "f2";
        }
        else if (windSpeed >=158 && windSpeed <=205)
        {
            classification = "f3";
        }
        else if (windSpeed >=206 && windSpeed <=260)
        {
            classification = "f4";
        }
        else if (windSpeed >=261)
        {
            classification = "f5";
        }
        else
        {
            classification = "Unclassified";
        }
        return classification;
    }

    @Override
    public String GetAdvice(String classification)
    {
        return null;
    }
}
