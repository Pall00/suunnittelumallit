package composite;
import java.util.ArrayList;
import java.util.List;


public class Tietokone implements ILaiteosa {
  private List<ILaiteosa> components;
  private int yhtHinta;
  
  public Tietokone() {
    components = new ArrayList<>();
  }
  
  public void addComponent(ILaiteosa component) {
    components.add(component);
  }
  
  public void removeComponent(ILaiteosa component) {
    components.remove(component);
  }
  
  @Override
  public int getHinta() {
    yhtHinta = 0;
    for (ILaiteosa component : components) {
      yhtHinta += component.getHinta();
    }
    return yhtHinta;
  }
  
  public void printComponentsAndHinta() {
    System.out.println("Yhteensä hinta: " + getHinta() + " euroa");
  }
}
