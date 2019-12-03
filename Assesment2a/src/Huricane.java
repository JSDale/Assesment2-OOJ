public class Huricane extends Storm
{
    @Override
    public String getClassificationFromSub()
    {
        switch(windSpeed)
        {
            case: windSpeed <=29;
                classification = "No Storm";
                return classification;

            case: windSpeed >=30 && windSpeed <=73;
                classification = "Tropical Storm";
                    return classification;

            case: windSpeed >=74 && windSpeed <=95;
                classification = "Category 1";
                    return classification;

            case: windSpeed >=96 && windSpeed <=110;
                    classificaion = "Category 2";
                            return classification;

            case: windSpeed >=111 && windSpeed <=129;
                classification = "Category 3";
                    return classification;

            case: windSpeed >=130 && windSpeed <=156;
                classification = "Category 4";
                    return classification;

            case: windSpeed >=156;
                classification = "Category 5";
                    return classification;
        }
    }
}
