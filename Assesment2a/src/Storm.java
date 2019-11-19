public abstract class Storm
{
    private int windSpeed;

    private String classification;

    private String advice;

    public String getAdviceFromSub() { return advice; }

    public abstract String getClassificationFromSub();

    public String CalcClassificationOfSub()
    {
        return classification;
    }

    //getters
    public int getWindSpeed() { return windSpeed; }

    public String getClassification() { return classification; }

    //setters
    public void setAdvice(String advice) { this.advice = advice; }

    public void setClassification(String classification) { this.classification = classification; }
}
