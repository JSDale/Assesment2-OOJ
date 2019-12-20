import javax.swing.*;

public class CreateStorm
{
    private int convertedTemp = 0;
    private int convertedWindSpeed =0;


    public void PopulateStormVariables(String windSpeed, String stormName, String stormType, String stormTemp)
    {

            try
            {
                convertedWindSpeed = Integer.parseInt(windSpeed);
                Storm.setWindSpeed(convertedWindSpeed);
                Gui.windSpeedIsInt = true;
            }
            catch(Exception wrongInput) { }


        Storm.setStormName(stormName);

            if (stormType == "")
            {
                JOptionPane.showMessageDialog(null, "Please enter a storm type");
            }
            else { Storm.setStormType(stormType); }

        if (stormType.equals("Blizzard"))
        {
                try
                {
                    convertedTemp = Integer.parseInt(stormTemp);
                    Storm.setTemp(convertedTemp);
                    Gui.tempIsInt = true;
                }
                catch(Exception wrongInput) { }
        }
        else{Storm.setTemp(0);}
    }
}
