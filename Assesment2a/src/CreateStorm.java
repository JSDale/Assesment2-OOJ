
public class CreateStorm
{
    private int convertedTemp = 0;
    private int convertedWindSpeed =0;


    public void PopulateStormVariables(String windSpeed, String stormName, String stormType, String stormTemp, Storm storm)
    {
            try
            {
                convertedWindSpeed = Integer.parseInt(windSpeed);
                storm.setWindSpeed(convertedWindSpeed);

                if(convertedWindSpeed < 0) { Resources.windSpeedIsInt = false; }

                else {Resources.windSpeedIsInt = true;}
            }
            catch(Exception wrongInput) { }

            storm.setStormName(stormName);
            storm.setStormType(stormType);

        if (stormType.equals("Blizzard"))
        {
                try
                {
                    convertedTemp = Integer.parseInt(stormTemp);
                    storm.setTemp(convertedTemp);
                    Resources.tempIsInt = true;
                }
                catch(Exception wrongInput) { }
        }
        else{storm.setTemp(0);}

    }
}
