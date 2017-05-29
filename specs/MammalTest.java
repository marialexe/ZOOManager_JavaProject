import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;


import zoo.*;

public class MammalTest {
  Mammal mammal;
  Mammal mammal1;

  @Before
  public void before() {
    ArrayList<String> foodMammal = new ArrayList<String>(
    Arrays.asList("antilope", "zebra", "giraphe"));
    ArrayList<String> foodMammal1 = new ArrayList<String>(
    Arrays.asList("milk", "grasses"));
    
    mammal = new Mammal("Lion", "adult", foodMammal,
      "savana", "walking");
    mammal1 = new Mammal("Elephant", "baby", foodMammal1,
      "savana", "walking");
  }

  @Test
  public void canGetClass() {
    assertThat(mammal, instanceOf(Mammal.class));
  }

  @Test
  public void canGetType() {
    assertEquals("Lion",mammal.getType());
  }

  @Test
  public void canGetAge(){
    assertEquals("adult",mammal.getAge());
  }

  @Test
  public void canGetFoods() {
    assertEquals(2, mammal1.eat().size());
    assertEquals(3, mammal.eat().size());
  }

  @Test 
  public void canGetHabitat() {
    assertEquals("savana",mammal.getHabitat());
  }

  @Test
  public void canGetMotion() {
    assertEquals("walking",mammal.getMotion());
  }

  @Test
  public void canGiveBirth() {
    assertEquals(true,mammal.giveBirth());
  }

  @Test
  public void canDrinkMilk_adult() {
    assertEquals(false,mammal.drinkMilk());
  }

  @Test
  public void canDrinkMilk_baby() {
    assertEquals(true,mammal1.drinkMilk());
  }

}