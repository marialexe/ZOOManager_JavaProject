package zoo;

import java.util.*;
import enums.*;

public class Enclosure {

  private Integer number;
  private HabitatType habitat;
  private String type;
  private Integer maxCapacity;
  private HashMap<String,Integer> animals;

  public Animal animal;
  public Integer quantity;

  public Enclosure(Integer number, HabitatType habitat, String type, Integer maxCapacity, HashMap<String,Integer> animals) {
    this.number = number;
    this.habitat = habitat;
    this.type = type;
    this.maxCapacity = maxCapacity;
    this.animals = new HashMap<String,Integer>();

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
    return this.animals;
  }

  public String addAnimal(Animal animal,Integer quantity) {

    Boolean existingAnimal = false;

    for (String key : animals.keySet()) {
      if (key.equals(animal.getType())) {
        existingAnimal = true;
        this.animals.put(key,animals.get(key) + quantity);
      }  
    }

    if (existingAnimal == false) {
      this.animals.put(animal.getType(),quantity);
    }
    
    Integer hashsize = animals.size();
    return "Animal added to the enclosure!";
  }


  public String removeAnimal(Animal animal, Integer quantity) {

    Boolean existingAnimal = false;

    for (String key : animals.keySet()) {
      if (key.equals(animal.getType())) {
        existingAnimal = true;
        break;
      }
    }

    if (existingAnimal == false) {
      return "The animal is not in the enclosure!";
    } 
    else {
      if (quantity == animals.get(animal.getType())) {
        animals.remove(animal.getType());
        return "The animal was completely removed from the enclosure!";
      } 
      else if (quantity < animals.get(animal.getType())) {
        animals.put(animal.getType(),animals.get(animal.getType()) - quantity);
        System.out.println(animals);
        return "The number was reduced!";
      }
      else {
        return "Sorry, not enough animals in the enclosure!";
      }

    }
    
  }
}