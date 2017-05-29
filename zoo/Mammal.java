package zoo;

import java.util.*;
public class Mammal extends Animal {

  private Boolean giveBirth;
  private Boolean drinkMilk;


  public Mammal(String type, String age, ArrayList<String> foods, String habitat, String motion){
    super(type, age, foods, habitat, motion);
    this.giveBirth = true;
    this.drinkMilk = true;
  }

  public Boolean giveBirth() {
    return this.giveBirth;
  }

  public Boolean drinkMilk() {
    if (getAge().equals("baby")) {
      return this.drinkMilk;
    } else {
      return !this.drinkMilk;
    }
  }


}