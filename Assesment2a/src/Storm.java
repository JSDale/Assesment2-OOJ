public abstract class Storm
{
    protected static String stormName;
    protected static String stormType;
    protected static int windSpeed;
    protected static int temp;
    protected static String classification;
    protected static String advice;
    protected Storm[] storedStorm = new Storm[20];

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

    public static void setClassification(String classification)
    {
        Storm.classification = classification;
    }

    public static void setStormType(String stormType) {Storm.stormType = stormType; }

    public static void setStormName(String stormName) {Storm.stormName = stormName; }

    public Storm()
    {
        for (int i = 0; i < storedStorm.length; i++)
        {
            //TODO fix this as i think the previous data types are going to get overwritten
            storedStorm[i] = new Blizzard();
            storedStorm[i] = new Huricane();
            storedStorm[i] = new Tornado();
        }
    }

    //methods
    public abstract String getClassificationFromSub();

}
