package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;
import interfaces.*;

public class Bat extends Mammal implements Flying{
  
  public Bat(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String fly() {
    return "I am a flying mammal!";
  }

}