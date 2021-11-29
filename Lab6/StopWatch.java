package Lab6;

public class StopWatch {
  private long startTime = System.currentTimeMillis();
  private long endTime = startTime;
  
public StopWatch() {
}
  
  public void start() {
    startTime = System.currentTimeMillis();
  }
  
  public void stop() {
    endTime = System.currentTimeMillis();
  }
  
  public long getElapsedTime() {
    return endTime - startTime;
  }  

}
