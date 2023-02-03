package observer;

public class Main {
    public static void main(String[] args) {
      ClockTimer timer = new ClockTimer();
      DigitalClock dc = new DigitalClock(timer);
  
      for (int i = 0; i < 60; i++) {
        timer.tick();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
  
  
  
  
