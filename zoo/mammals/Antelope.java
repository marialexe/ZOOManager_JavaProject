package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;
import interfaces.*;

public class Antelope extends Mammal implements Walking, Running, Edible {

  public Antelope(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String walk() {
    return "Enjoys walking!";
  }

  public String run() {
    return "When I see a big cat, I am running!";
  }

  public String foodType() {
    return getType();
  }
}