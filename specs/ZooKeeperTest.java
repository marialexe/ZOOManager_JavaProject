import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import zoo.*;
import enums.*;
import zoo.mammals.*;

public class ZooKeeperTest {
  ZooKeeper zookeeper;
  ArrayList<Enclosure> enclosures;
  Enclosure polar;
  Enclosure savanna;

  Mammal lion;
  Antelope antelope;
  Giraphe giraphe;

  @Before
  public void before(){
    enclosures = new ArrayList<Enclosure>();
    enclosures.add(polar);
    enclosures.add(savanna);
    zookeeper = new ZooKeeper("John",enclosures);

    ArrayList<String> foodLion = new ArrayList<String>(
    Arrays.asList("antelope", "zebra", "giraphe"));
    lion = new Mammal("Lion", AgeType.ADULT, foodLion,
      HabitatType.SAVANNA, "walking");

    ArrayList<String> foodAntelope = new ArrayList<String>(
    Arrays.asList("grasses", "bushes"));
    antelope = new Antelope("Antelope", AgeType.ADULT, foodAntelope,
      HabitatType.SAVANNA, "walking");

    ArrayList<String> foodGiraphe = new ArrayList<String>(
    Arrays.asList("grasses", "bushes"));
    giraphe = new Giraphe("Giraphe", AgeType.ADULT, foodGiraphe,
      HabitatType.SAVANNA, "walking");
  }

  @Test
  public void zookeeperClassExists(){
    assertThat(zookeeper, instanceOf(ZooKeeper.class));
  }

  @Test
  public void canGetName(){
    assertEquals("John", zookeeper.getName());
  }

  @Test
  public void canFeedAnimal_canEatFood(){
    zookeeper.feedAnimal(lion, antelope);
    assertEquals(1, lion.getBelly().size());
    zookeeper.feedAnimal(lion, giraphe);
    assertEquals(2,lion.getBelly().size());
  }



}