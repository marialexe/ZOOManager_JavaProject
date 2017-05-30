package zoo;

import java.util.*;
import enums.*;

public class Amphibian extends Animal {

  public Amphibian(String type, AgeType age, ArrayList<String> foods, String habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }

  public String permeableSkin () {
    return "I can breath through my skin!";
  }
}