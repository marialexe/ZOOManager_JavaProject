package zoo;

import enums.*;
import java.util.*;

public abstract class Animal {
  
  private String type;
  private AgeType age;
  private ArrayList<String> foods;
  private HabitatType habitat;
  private String motion;
  private ArrayList<Edible> belly;
  
  public Animal(String type, AgeType age, ArrayList<String> foods, HabitatType habitat, String motion){
    this.type = type;
    this.age = age;
    this.foods = foods;
    this.habitat = habitat;
    this.motion = motion;
    this.belly = new ArrayList<Edible>();
  }

  public String getType() {
    return this.type;
  }

  public AgeType getAge() {
    return this.age;
  }

  public ArrayList<String> edibleFoods() {
    return this.foods;
  }

  public HabitatType getHabitat() {
    return this.habitat;
  };
  public String getMotion() {
    return this.motion;
  };

  public ArrayList<Edible> getBelly(){
    return this.belly;
  }
}