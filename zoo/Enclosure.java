package zoo;

import java.util.*;
import enums.*;

public class Enclosure {

  private Integer number;
  private HabitatType habitat;
  private String type;
  private Integer maxCapacity;
  private HashMap<String,Integer> animalsLog;
  private ArrayList<Animal> arrayAnimals;

  public Animal animal;
  public Integer quantity;

  public Enclosure(Integer number, HabitatType habitat, String type, Integer maxCapacity, HashMap<String,Integer> animalsLog) {
    this.number = number;
    this.habitat = habitat;
    this.type = type;
    this.maxCapacity = maxCapacity;
    this.animalsLog = new HashMap<String,Integer>();
    this.arrayAnimals = new ArrayList<Animal>();

  }

  public Integer getNumber() {
    return this.number;
  }

  public HabitatType getHabitat() {
    return this.habitat;
  }

  public String getType() {
    return this.type;
  }

  public Integer getMaxCapacity() {
    return this.maxCapacity;
  }

  public HashMap<String,Integer> getAnimals() {
    return this.animalsLog;
  }

  public ArrayList<Animal> getArrayAnimals() {
    return this.arrayAnimals;
  }

  public String addAnimal(Animal animal,Integer quantity) {

    Boolean existingAnimal = false;

    for (String key : animalsLog.keySet()) {
      if (key.equals(animal.getType())) {
        existingAnimal = true;
        this.animalsLog.put(key,animalsLog.get(key) + quantity);
      }  
    }

    if (existingAnimal == false) {
      this.animalsLog.put(animal.getType(),quantity);
      this.arrayAnimals.add(animal);
    }
    
    Integer hashsize = animalsLog.size();
    Integer arraysize = arrayAnimals.size();

    if (hashsize == arraysize) {
      return "Animal added to the enclosure!";
    } else {
      return "ACHTUNG! Animal not properly added!!!";
    }
    
  }


  public String removeAnimal(Animal animal, Integer quantity) {
    if (animalsLog.containsKey(animal.getType())) {
      if (quantity == animalsLog.get(animal.getType())) {
        this.animalsLog.remove(animal.getType());
        this.arrayAnimals.remove(animal);
        return "Animal completely removed from enclosure!";
      } 
      else if (quantity < animalsLog.get(animal.getType())) {
        this.animalsLog.put(animal.getType(),animalsLog.get(animal.getType()) - quantity);
        System.out.println(animalsLog);
        return "The number of animals was reduced!";
      }
      else {
        return "Sorry, not enough animals in the enclosure!";
      }
    }
    else {
      return "Animal not in the enclosure!";
    }
  }
}