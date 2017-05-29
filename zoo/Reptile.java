package zoo;

import java.util.*;

public class Reptile extends Animal {

  private Boolean coldBlooded;

  public Reptile (String type, AgeType age, ArrayList<String> foods, String habitat, String motion) {
    super(type, age, foods, habitat, motion);
  }

  public Boolean coldBlooded() {
    this.coldBlooded = true;
    return this.coldBlooded;
  }

  public String boneyScaleySkin() {
    return "Reptiles have thick and rugged armoured skin with scales.";
  }
}
