public class Blizzard extends Storm
{
    private int temp;
    private int windSpeed;

    public Blizzard()
    {
        windSpeed = getWindSpeed();
        //temp = get temp from text box
    }

    @Override
    public String getClassificationFromSub()
    {
        return getClassification();
    }
}
