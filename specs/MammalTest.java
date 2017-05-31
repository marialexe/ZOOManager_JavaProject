import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;


import zoo.*;
import enums.*;

public class MammalTest {
  Mammal lion;
  Mammal elephant;

  @Before
  public void before() {

    ArrayList<String> foodLion = new ArrayList<String>(
    Arrays.asList("antilope", "zebra", "giraphe"));
    lion = new Mammal("Lion", AgeType.ADULT, foodLion,
      HabitatType.SAVANNA, "walking");

    ArrayList<String> foodElephant = new ArrayList<String>(
    Arrays.asList("milk", "grasses"));
    elephant = new Mammal("Elephant", AgeType.BABY, foodElephant,
      HabitatType.SAVANNA, "walking");
  }

  @Test
  public void canGetClass() {
    assertThat(lion, instanceOf(Mammal.class));
  }

  @Test
  public void canGetType() {
    assertEquals("Lion",lion.getType());
  }

  @Test
  public void canGetAge(){
    assertEquals(AgeType.ADULT,lion.getAge());
  }

  @Test
  public void canGetFoods() {
    assertEquals(2, elephant.edibleFoods().size());
    assertEquals(3, lion.edibleFoods().size());
  }

  @Test 
  public void canGetHabitat() {
    assertEquals(HabitatType.SAVANNA,lion.getHabitat());
  }

  @Test
  public void canGetMotion() {
    assertEquals("walking",lion.getMotion());
  }

  @Test
  public void canGiveBirth() {
    assertEquals(true,lion.giveBirth());
  }

  @Test
  public void canDrinkMilk_adult() {
    assertEquals(false,lion.drinkMilk());
  }

  @Test
  public void canDrinkMilk_baby() {
    assertEquals(true,elephant.drinkMilk());
  }

  @Test
  public void canGetEmptyBelly() {
    assertEquals(0,elephant.getBelly().size());
  }

}