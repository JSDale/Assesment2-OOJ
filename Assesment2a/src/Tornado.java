public class Tornado extends Storm
{
    public Tornado()
    {
        this.stormName = getStormName();
        this.stormType = getStormType();
        this.windSpeed = getWindSpeed();
        this.temp = getTemp();
        this.classification = getClassification();
        this.advice = getAdvice();
    }

    @Override
    public String RetrieveClassification()
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
        switch (classification)
        {
            case "Unclassified":
                advice = "There is no need to panic";
                return advice;
            case "f0":
            case "f1":
                advice = "Find safe room/shelter, shield yourself from debris";
                return advice;
            case "f2":
            case "f3":
            case "f4":
            case "f5":
                advice = "Find underground shelter, crouch near to the floor covering your head with your hands";
                return advice;
        }
        return advice;
    }
}
