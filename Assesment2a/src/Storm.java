import java.util.ArrayList;

public abstract class Storm
{
    protected int windSpeed;
    protected int temp;
    protected String classification;
    protected String advice;
    ArrayList storm = new ArrayList<Storm>();

    public abstract String getClassificationFromSub();

}
