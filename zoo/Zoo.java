package zoo;

import java.util.*;

public class Zoo {

  private String name;
  private ArrayList<Enclosure> enclosures;

  public Zoo(String name, ArrayList<Enclosure> enclosures) {
    this.name = name;
    this.enclosures = enclosures;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Enclosure> getEnclosures() {
    return this.enclosures;
  }

  public void addEnclosure(Enclosure enclosure) {
    getEnclosures().add(enclosure);
  }

  public void removeEnclosure(Enclosure enclosure) {
    getEnclosures().remove(enclosure);
  }
}