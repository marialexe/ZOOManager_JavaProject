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
    mammal = new Mammal("Lion", AgeType.ADULT, foodMammal,
      "savana", "walking");

    ArrayList<String> foodMammal1 = new ArrayList<String>(
    Arrays.asList("milk", "grasses"));
    mammal1 = new Mammal("Elephant", AgeType.BABY, foodMammal1,
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
    assertEquals(AgeType.ADULT,mammal.getAge());
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