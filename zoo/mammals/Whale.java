package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;

public class Whale extends Mammal {
  
  public Whale(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String swim() {
    return "I am the largest marine mammal!";
  }

}