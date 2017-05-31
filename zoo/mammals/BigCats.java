package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;

public class BigCats extends Mammal {
  
  public BigCats(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String run() {
    return "We are the fastest running mammals!";
  }

  public String walk() {
    return "We can walk, but we prefer running!";
  }
}