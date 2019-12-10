import javax.swing.*;

public class CreateStorm
{
    private int convertedTemp = 0;
    private int convertedWindSpeed =0;

    public void PopulateStormVariables(String windSpeed, String stormName, String stormType, String stormTemp)
    {
        //TODO do while loop so you can't enter a non int value
        try
        {
            convertedWindSpeed = Integer.parseInt(windSpeed);
            Storm.setWindSpeed(convertedWindSpeed);
        }
        //TODO make message box appear display from gui class.
        catch(Exception wrongInput) { JOptionPane.showMessageDialog(null, "Please enter an integer into the wind speed"); }

        Storm.setStormName(stormName);
        do
        {
            if (stormType == "")
            {
                //TODO make message box appear display from gui class.
                JOptionPane.showMessageDialog(null, "Please enter a storm type");
            }
            else { Storm.setStormType(stormType); }
        } while (stormType == "");

        if (stormType.equals("Blizzard"))
        {
            //TODO do while loop so you can't enter a non int value
            try
            {
                convertedTemp = Integer.parseInt(stormTemp);
            }
            //TODO make message box appear display from gui class.
            catch (Exception wrongInput)
            {
                JOptionPane.showMessageDialog(null, "Please enter an integer into the temp");
            }

            if (stormType == "Blizzard")
            {
                Storm.setTemp(convertedTemp);
            } else { Storm.setTemp(0); }
        }
        else {Storm.setTemp(0);}
    }

    private boolean StormStored()
    {


        return false;
    }

    public String GetCorrectAdvice(Huricane hurricane)
    {
        String advice = "No advice to display.";
        Storm.setAdvice(advice);

        if (Storm.getStormType() == "Hurricane")
        {
           Storm.setAdvice(hurricane.GetAdvice(hurricane.GetClassification()));
        }

        return Storm.getAdvice();
    }
}
