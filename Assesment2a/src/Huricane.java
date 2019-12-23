public class Huricane extends Storm
{
    public Huricane()
    {
        stormName = getStormName();
        stormType = getStormType();
        windSpeed = getWindSpeed();
        temp = getTemp();
        classification = getClassification();
        advice = getAdvice();
    }

    @Override
    public String GetClassification()
    {
        if(windSpeed <39 && windSpeed >=25)
        {
            classification = "Tropical Depression";
        }
        else if (windSpeed >= 39 && windSpeed <= 73)
        {
        classification = "Tropical Storm";
        }
        else if (windSpeed >=74 && windSpeed <=95)
        {
            classification = "Category 1";
        }
        else if (windSpeed >=96 && windSpeed <=110)
        {
            classification = "Category 2";
        }
        else if (windSpeed >=111 && windSpeed <=129)
        {
            classification = "Category 3";
        }
        else if (windSpeed >=130 && windSpeed <=156)
        {
            classification = "Category 4";
        }
        else if (windSpeed >=156)
        {
            classification = "Category 5";
        }
        else
        {
            classification = "not a Hurricane";
        }
        return classification;
    }

    @Override
    public String GetAdvice(String classification)
    {
        //TODO set up proper advice
        switch(classification)
        {
            case "Category 1":
            case "Category 2":
                advice = "“Close storm shutters and stay away from windows";
                return advice;
            case "Category 3":
                advice = "Coastal regions are encouraged to evacuate";
                return advice;
            case "Category 4":
            case "Category 5":
                advice = "Evacuate";
                return advice;
            case "Tropical Storm":
                advice = "Prepare for a possible Hurricane";
                return advice;

        }
        return "No advice to give.";
    }
}
