public class Tornado extends Storm
{
    private int windSpeed;

    public Tornado()
    {
        windSpeed = getWindSpeed();
    }

    @Override
    public String getClassificationFromSub()
    {
        if (windSpeed >=40 && windSpeed <=72)
        {
            setClassification("f0");
        }
        else if (windSpeed >=73 && windSpeed <=112)
        {
            setClassification("f1");
        }
        else if (windSpeed >=113 && windSpeed <=157)
        {
            setClassification("f2");
        }
        else if (windSpeed >=158 && windSpeed <=205)
        {
            setClassification("f3");
        }
        else if (windSpeed >=206 && windSpeed <=260)
        {
            setClassification("f4");
        }
        else if (windSpeed >=261)
        {
            setClassification("f5");
        }
        else
        {
            setClassification("Unclassified");
        }
        return getClassification();
    }
}
