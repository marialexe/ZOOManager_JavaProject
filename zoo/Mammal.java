package zoo;

import java.util.*;
public class Mammal {

  private String type;
  private String age;

  public Mammal(String type, String age){
    this.type = type;
    this.age = age;
  }

  public String canGetType(){
    return this.type;
  }
}