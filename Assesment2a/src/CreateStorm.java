import javax.swing.*;

public class CreateStorm
{
    int convertedTemp = 0;

    public void PopulateStormVariables(String windSpeed, String stormName, String stormType, String stormTemp)
    {
        int convertedWindSpeed =0;
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
                JOptionPane.showMessageDialog(null, "Please enter an integer into the wind speed");
            }
            else { Storm.setStormType(stormType); }
        } while (stormType == "");

        //TODO do while loop so you can't enter a non int value
        try
        {
            convertedTemp = Integer.parseInt(stormTemp);
        }
        //TODO make message box appear display from gui class.
        catch(Exception wrongInput) { JOptionPane.showMessageDialog(null, "Please enter an integer into the wind speed"); }

        if (stormType == "Blizzard")
        {
            Storm.setTemp(convertedTemp);
        }
        else { Storm.setTemp(0); }
    }

    private boolean StormStored()
    {


        return false;
    }
}
