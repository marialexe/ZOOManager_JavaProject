import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import zoo.*;
import enums.*;

public class EnclosureTest {
  Enclosure polar;
  HashMap<String,Integer> animalsLog;
  Animal seal;
  Animal penguin;
  Animal walrus;

  @Before
  public void before() {

    ArrayList<String> foodSeal = new ArrayList<String>(
    Arrays.asList("salmon", "herring", "squid"));
    seal = new Mammal("seal", AgeType.TEENAGER, foodSeal,
      HabitatType.SEA, "swimming");

    ArrayList<String> foodPenguin = new ArrayList<String>(
    Arrays.asList("krill", "squid", "fishes"));
    penguin = new Bird("penguin", AgeType.ADULT, foodPenguin,
      HabitatType.POLAR, "swimming");

    ArrayList<String> foodWalrus = new ArrayList<String>(
    Arrays.asList("krill", "squid", "fishes"));
    walrus = new Mammal("walrus", AgeType.ADULT, foodWalrus,
      HabitatType.POLAR, "swimming");

    polar = new Enclosure(3,HabitatType.POLAR, "land and water tank", 30, animalsLog);
  }

  @Test
  public void canGetClass(){
    assertThat(polar, instanceOf(Enclosure.class));
  }

  @Test
  public void canGetNumber() {
    assertEquals(3,polar.getNumber().longValue());
  }

  @Test
  public void canGetHabitat() {
    assertEquals(HabitatType.POLAR,polar.getHabitat());
  }

  @Test
  public void canGetType() {
    assertEquals("land and water tank", polar.getType());
  }

  @Test
  public void canGetMaxCapacity() {
    assertEquals(30,polar.getMaxCapacity().longValue());
  }

  @Test
  public void enclosureInitiallyEmpty() {
    assertEquals(0,polar.getAnimals().size());
  }

  @Test
  public void canAddAnimal() {
    polar.addAnimal(seal,10);
    assertEquals(1,polar.getAnimals().size());
    assertEquals(1,polar.getArrayAnimals().size());

    polar.addAnimal(penguin,15);
    assertEquals(2,polar.getAnimals().size());
    assertEquals(2,polar.getArrayAnimals().size());
  }

  @Test
  public void canRemoveAnimal_completely() {
    polar.addAnimal(seal,10);
    polar.addAnimal(penguin,15);
    polar.addAnimal(walrus,5);
    polar.removeAnimal(penguin,15);
    assertEquals(2,polar.getAnimals().size());
    assertEquals(2,polar.getArrayAnimals().size());
    polar.removeAnimal(walrus,5);
    assertEquals(1,polar.getAnimals().size());
    assertEquals(1,polar.getArrayAnimals().size());

  }

  @Test
  public void canRemoveAnimal_completely2() {
    polar.addAnimal(penguin,15);
    assertEquals("Animal completely removed from enclosure!",polar.removeAnimal(penguin,15));
  }

  @Test 
  public void canRemoveAnimal_partially() {
    polar.addAnimal(seal,10);
    polar.addAnimal(penguin,15);
    polar.removeAnimal(seal,5);
    polar.removeAnimal(penguin,5);
    assertEquals(2,polar.getAnimals().size());
    assertEquals(2,polar.getArrayAnimals().size());
  }

  @Test 
  public void canRemoveAnimal_partially2() {
    polar.addAnimal(seal,10);
    assertEquals("The number of animals was reduced!",polar.removeAnimal(seal,5));
  }

}