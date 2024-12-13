public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public int getmaxTemp()
    {
        return maxTemp;
    }
    public int getcurrentTemp()
    {
        return currentTemp;
    }
    public void setmaxTemp(int MAXTEMP)
    {
        maxTemp = MAXTEMP;
    }
    public void setcurrentTemp(int CURRENTTEMP)
    {
        currentTemp = CURRENTTEMP;
    }



    public void turnOff()
    {
        currentTemp = 0;
    }
    public boolean isOn()
    {
        if (currentTemp > 0)
        {
            return true;
        }
        return false;
    }
    public void preheat(int temp)
    {
        if (temp >= 0)
        {
            currentTemp = temp;

            if (temp > maxTemp)
            {
                currentTemp = maxTemp;
            }
        }
    
    }
    public String toString()
    {
        return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp;
    }
}
