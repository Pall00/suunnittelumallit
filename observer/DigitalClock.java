package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

class DigitalClock implements Observer {
  
  private ClockTimer timer;

  public DigitalClock(ClockTimer ct) {
    timer = ct;
    timer.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Aika on: " + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
  }
}


