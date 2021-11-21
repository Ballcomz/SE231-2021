package Lab4;

public class Counter {
    int count;  
    public Counter()
    {
        count = 0;
    }
    public void click()
    {
        count++;
    }
    public int getCount()
    {
        return count;
    }
    public void reset()
    {
        count = 0;
    }

}
