import javax.swing.*;

public class CreateStorm
{
    private int convertedTemp = 0;
    private int convertedWindSpeed =0;


    public Storm PopulateStormVariables(String windSpeed, String stormName, String stormType, String stormTemp, Storm storm)
    {
            try
            {
                convertedWindSpeed = Integer.parseInt(windSpeed);
                storm.setWindSpeed(convertedWindSpeed);

                if(convertedWindSpeed < 0) { Gui.windSpeedIsInt = false; }

                else {Gui.windSpeedIsInt = true;}
            }
            catch(Exception wrongInput) { }


        storm.setStormName(stormName);

            if (stormType == "")
            {
                JOptionPane.showMessageDialog(null, "Please enter a storm type");
            }
            else { storm.setStormType(stormType); }

        if (stormType.equals("Blizzard"))
        {
                try
                {
                    convertedTemp = Integer.parseInt(stormTemp);
                    storm.setTemp(convertedTemp);
                    Gui.tempIsInt = true;
                }
                catch(Exception wrongInput) { }
        }
        else{storm.setTemp(0);}

        return storm;
    }
}
