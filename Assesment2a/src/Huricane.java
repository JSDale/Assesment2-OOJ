public class Huricane extends Storm
{
    @Override
    public String GetClassification()
    {
        if (windSpeed >=74 && windSpeed <=95)
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
            classification = "Tropical Storm";
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
                advice = "";
                return advice;
            case "Category 2":
                advice = "";
                return advice;
            case "Category 3":
                advice = "";
                return advice;
            case "Category 4":
                advice = "";
                return advice;
            case "Category 5":
                advice = "";
                return advice;
            case "Category 6":
                advice = "";
                return advice;
            case "Tropical Storm":
                advice = "";
                return advice;

        }
        return "No advice to give.";
    }
}
