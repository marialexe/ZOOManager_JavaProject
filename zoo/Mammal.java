package zoo;

import enums.*;
import java.util.*;

public class Mammal extends Animal {

  private Boolean giveBirth;
  private Boolean drinkMilk;


  public Mammal(String type, AgeType age, ArrayList<String> foods, String habitat, String motion) {
    super(type, age, foods, habitat, motion);
    this.giveBirth = giveBirth;
    this.drinkMilk = drinkMilk;
  }

  public Boolean giveBirth() {
    if (getType().equals("Platypus") || getType().equals("Echidna")) {
      this.giveBirth = false;
    } else {
      this.giveBirth = true;
    }
    return this.giveBirth;
  }

  public Boolean drinkMilk() {
    if (getAge().equals(AgeType.BABY)) {
      this.drinkMilk = true;
    } else {
      this.drinkMilk = false;
    }
    return this.drinkMilk;
  }


}