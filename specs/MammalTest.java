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
  Mammal platypus;
  Mammal echidna;

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

    ArrayList<String> foodPlatypus = new ArrayList<String>(
    Arrays.asList("grasses"));
    platypus = new Mammal("Platypus", AgeType.TEENAGER, foodPlatypus,
      HabitatType.WETLAND, "walking");

    ArrayList<String> foodEchidna = new ArrayList<String>(
    Arrays.asList("insects"));
    echidna = new Mammal("Echidna", AgeType.ADULT, foodEchidna,
      HabitatType.WETLAND, "walking");
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
  public void canGiveBirth_true() {
    assertEquals(true,lion.giveBirth());
    assertEquals(true,elephant.giveBirth());
  }

  @Test
  public void canGiveBirth_false() {
    assertEquals(false,platypus.giveBirth());
    assertEquals(false,echidna.giveBirth());
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