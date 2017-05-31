package zoo;

import java.util.*;

public class ZooKeeper {

  private String name;
  private ArrayList<Enclosure> enclosures;

  public ZooKeeper(String name, ArrayList<Enclosure> enclosures) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Enclosure> getEnclosures() {
    return this.enclosures;
  }

  public void feedAnimal(Animal animal, Edible food){
    for (String item : animal.edibleFoods()) {
      if (item.toLowerCase().equals(food.foodType().toLowerCase())) {
        animal.getBelly().add(food);
      } 
    }
  }

}