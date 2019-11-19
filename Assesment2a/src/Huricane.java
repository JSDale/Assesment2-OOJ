public class Huricane extends Storm
{
    private int windSpeed;

    public Huricane()
    {
        windSpeed = getWindSpeed();
    }

    @Override
    public String getClassificationFromSub()
    {
        if (windSpeed >=74 && windSpeed <=95)
        {
            setClassification("Category 1");
        }
        else if (windSpeed >=96 && windSpeed <=110)
        {
            setClassification("Category 2");
        }
        else if (windSpeed >=111 && windSpeed <=129)
        {
            setClassification("Category 3");
        }
        else if (windSpeed >=130 && windSpeed <=156)
        {
            setClassification("Category 4");
        }
        else if (windSpeed >=156)
        {
            setClassification("Category 5");
        }
        else
        {
            setClassification("Tropical Storm");
        }

        return getClassification();
    }
}
