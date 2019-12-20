
public abstract class Storm
{
    public  String stormName;
    public  String stormType;
    public  int windSpeed;
    public  int temp;
    public  String classification;
    public  String advice;

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
    public int getWindSpeed() { return windSpeed; }

    public  int getTemp() { return temp; }

    public  String getClassification()
    {
        return classification;
    }

    public  String getAdvice()
    {
        return advice;
    }

    public  String getStormType() {return stormType; }

    public  String getStormName() {return stormName;}

    //setters
    public  void setWindSpeed(int setWindSpeed) { windSpeed = setWindSpeed; }

    public  void setTemp(int setTemp)
    {
        temp = setTemp;
    }

    public  void setStormType(String setStormType) {stormType = setStormType; }

    public  void setStormName(String setStormName) {stormName = setStormName; }

    public  void setAdvice(String setAdvice) {advice = setAdvice;}


    //methods
    public abstract String GetClassification();

    public abstract String GetAdvice(String classification);

    public String ToString()
    {
        return getStormName() + " " + getStormType();
    }

}
