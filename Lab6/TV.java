package Lab6;

public class TV {
    private int channel;
    private int volume;
    private boolean flag;
    
    public TV()
    {
        channel = 2;
        volume = 10;
        flag = false;
    }
    public void turnOnOff(){
        if (flag == true)
            flag = false;
        else
            flag = true;
    }
    public void setChannel(int n){
        if (n <0 || n > 99)
            System.out.println("value exceed than limit.");
        else
            channel = n;
    }
    public void incVolume(){
        if (volume < 0 || volume > 20)
            System.out.println("Value exceed than limit.");
        else
            volume += 1;
    }
     public void decVolume(){
        if (volume < 0 || volume > 20)
            System.out.println("Value exceed than limit.");
        else
            volume -= 1;
    }
         public int getVolume()
    {
        return volume;
    }
    public int getChannel()
    {
        return channel;
    }
    public boolean getFlag()
    {
        return flag;
    }

}
