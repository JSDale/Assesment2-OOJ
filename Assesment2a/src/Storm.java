import java.util.ArrayList;

public abstract class Storm
{
    protected static int windSpeed;
    protected static int temp;
    protected static String classification;
    protected static String advice;

    //getters
    public static int getWindSpeed()
    {
        return windSpeed;
    }

    public static int getTemp()
    {
        return temp;
    }

    public static String getClassification()
    {
        return classification;
    }

    public static String getAdvice()
    {
        return advice;
    }

    //setters
    public static void setWindSpeed(int windSpeed)
    {
        Storm.windSpeed = windSpeed;
    }

    public static void setTemp(int temp)
    {
        Storm.temp = temp;
    }

    public static void setClassification(String classification)
    {
        Storm.classification = classification;
    }

    public abstract String getClassificationFromSub();

}
