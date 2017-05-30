package zoo;

import enums.*;
import java.util.*;

public class Bird extends Animal {

  private Boolean fly;
  private Boolean eggs;
  private ArrayList<String> cantFlyBirds;

  public Bird(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
    this.fly = fly;
    this.eggs = true;
    this.cantFlyBirds = new ArrayList<String>(Arrays.asList("penguin","streamer duck", "weka", "ostrich", "kiwi", "kakapo", "takahe", "cassowary"));
  }

  public String fly() {
    if (cantFlyBirds.contains(getType())) {
      this.fly = false;
      return "This bird CAN'T fly!";
    } else {
      this.fly = true;
      return "This bird can fly!";
    }
  }

  public Boolean layEggs() {
    return this.eggs;
  }

}
