import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import zoo.*;
import enums.*;

public class EnclosureTest {
  Enclosure enclosure;
  HashMap<String,Integer> animals;
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

    enclosure = new Enclosure(3,HabitatType.POLAR, "land and water tank", 30, animals);
  }

  @Test
  public void canGetClass(){
    assertThat(enclosure, instanceOf(Enclosure.class));
  }

  @Test
  public void canGetNumber() {
    assertEquals(3,enclosure.getNumber().longValue());
  }

  @Test
  public void canGetHabitat() {
    assertEquals(HabitatType.POLAR,enclosure.getHabitat());
  }

  @Test
  public void canGetType() {
    assertEquals("land and water tank", enclosure.getType());
  }

  @Test
  public void canGetMaxCapacity() {
    assertEquals(30,enclosure.getMaxCapacity().longValue());
  }

  @Test
  public void enclosureInitiallyEmpty() {
    assertEquals(0,enclosure.getAnimals().size());
  }

  @Test
  public void canAddAnimal() {
    enclosure.addAnimal(seal,10);
    assertEquals(1,enclosure.getAnimals().size());

    enclosure.addAnimal(penguin,15);
    assertEquals(2,enclosure.getAnimals().size());
  }

  @Test
  public void canRemoveAnimal_completely() {
    enclosure.addAnimal(seal,10);
    enclosure.addAnimal(penguin,15);
    enclosure.addAnimal(walrus,5);
    enclosure.removeAnimal(penguin,15);
    assertEquals(2,enclosure.getAnimals().size());
    enclosure.removeAnimal(walrus,5);
    assertEquals(1,enclosure.getAnimals().size());

  }

  @Test
  public void canRemoveAnimal_completely2() {
    enclosure.addAnimal(penguin,15);
    assertEquals("Animal completely removed from enclosure!",enclosure.removeAnimal(penguin,15));
  }

  @Test 
  public void canRemoveAnimal_partially() {
    enclosure.addAnimal(seal,10);
    enclosure.addAnimal(penguin,15);
    enclosure.removeAnimal(seal,5);
    enclosure.removeAnimal(penguin,5);
    assertEquals(2,enclosure.getAnimals().size());
  }

  @Test 
  public void canRemoveAnimal_partially2() {
    enclosure.addAnimal(seal,10);
    assertEquals("The number of animals was reduced!",enclosure.removeAnimal(seal,5));
  }

}