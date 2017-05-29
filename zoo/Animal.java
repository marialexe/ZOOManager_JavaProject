package zoo;

import java.util.*;

public abstract class Animal {
  
  private String type;
  private String age;
  private ArrayList<String> foods;
  private String habitat;
  private String motion;
  
  public Animal(String type, String age, ArrayList<String> foods, String habitat, String motion){
    this.type = type;
    this.age = age;
    this.foods = foods;
    this.habitat = habitat;
    this.motion = motion;
  }

  public String getType() {
    return this.type;
  }

  public String getAge() {
    return this.age;
  }

  public ArrayList<String> eat() {
    return this.foods;
  }

  public String getHabitat() {
    return this.habitat;
  };
  public String getMotion() {
    return this.motion;
  };
}