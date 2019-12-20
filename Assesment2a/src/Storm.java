
public abstract class Storm
{
    public static String stormName;
    public static String stormType;
    public static int windSpeed;
    public static int temp;
    public static String classification;
    public static String advice;

    public Storm()
    {
        stormName = getStormName();
        stormType = getStormType();
        windSpeed = getWindSpeed();
        temp = getTemp();
        classification = getClassification();
        advice = getAdvice();
    }


    //getters
    public static int getWindSpeed() { return windSpeed; }

    public static int getTemp() { return temp; }

    public static String getClassification()
    {
        return classification;
    }

    public static String getAdvice()
    {
        return advice;
    }

    public static String getStormType() {return stormType; }

    public static String getStormName() {return stormName;}

    //setters
    public static void setWindSpeed(int windSpeed)
    {
        Storm.windSpeed = windSpeed;
    }

    public static void setTemp(int temp)
    {
        Storm.temp = temp;
    }

    public static void setStormType(String stormType) {Storm.stormType = stormType; }

    public static void setStormName(String stormName) {Storm.stormName = stormName; }

    public static void setAdvice(String advice) {Storm.advice = advice;}


    //methods
    public abstract String GetClassification();

    public abstract String GetAdvice(String classification);

    public String ToString()
    {
        return getStormName() + " " + getStormType();
    }

}
