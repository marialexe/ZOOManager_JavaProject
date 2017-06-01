package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;
import interfaces.*;

public class Giraphe extends Mammal implements Walking, Running, Edible {

  public Giraphe(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String walk() {
    return "I can walk with my very long legs.";
  }

  public String run() {
    return "I can also run, if I have to.";
  }

  public String foodType() {
    return getType();
  }
}