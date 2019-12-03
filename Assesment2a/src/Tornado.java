public class Tornado extends Storm
{
    public Tornado()
    {

    }

    @Override
    public String getClassificationFromSub()
    {
        switch(windSpeed)
        {
            case: windSpeed <=39;
                classification = "Unclassified";
                return classification;

            case: windSpeed >=40 && windSpeed <=72;
                classification = "f0";
                return classification;

            case: windSpeed >=73 && windSpeed <=112;
                classificaion = "f1";
                return classification;

            case: windSpeed >=113 && windSpeed <=157;
                classification = "f2";
                return classification;

            case: windSpeed >=158 && windSpeed <=205;
                classification = "f3";
                return classification;

            case: windSpeed >=206 && windSpeed <=260;
                classification = "f4";
                return classification;

            case: windSpeed >=261;
                classification = "f5";
                return classification;
        }
    }
}
