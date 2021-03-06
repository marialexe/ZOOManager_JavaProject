package zoo;

import java.util.*;

import enums.*;
import interfaces.*;

public class Fish extends Animal implements Swimming, Edible {

  public Fish(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }

  public String swim() {
    return "I can only swim!";
  }

  public String noLegs() {
    return "Fish have no legs!";
  }

  public String foodType() {
    return getType();
  }

}