package zoo.mammals;

import java.util.*;

import zoo.*;
import enums.*;

public class BigCats extends Mammal {
  
  public Antelope(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }
  
  public String foodType() {
    return getType();
  }

  }
}