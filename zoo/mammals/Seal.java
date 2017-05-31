package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;
import interfaces.*;

public class Seal extends Mammal implements Edible {
  
  public Seal(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String swim() {
    return "I am a good swimmer for a mammal!";
  }

  public String crawl() {
    return "I can't walk, but I can crawl!";
  }

  public String foodType() {
    return getType();
  }

}