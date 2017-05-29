import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;


import zoo.*;

public class BirdTest {
  Bird bird;
  Bird bird1;
  Bird bird2;

  @Before
  public void before() {

    ArrayList<String> foodBird = new ArrayList<String>(
    Arrays.asList("krill", "squid", "fishes"));
    bird = new Bird("penguin", AgeType.ADULT, foodBird,
      "polar region", "swimming");

    ArrayList<String> foodBird1 = new ArrayList<String>(
    Arrays.asList("insects", "lizards", "small rodents"));
    bird1 = new Bird("ostrich", AgeType.BABY, foodBird1,
      "savanna", "walking");

    ArrayList<String> foodBird2 = new ArrayList<String>(
    Arrays.asList("insects", "fishes"));
    bird2 = new Bird("stork",AgeType.TEENAGER, foodBird2,
      "marsh", "flying");
  }

    @Test
    public void birdClassExists() {
      assertThat(bird1,instanceOf(Bird.class));
    }

    @Test
    public void canFly_false() {
      assertEquals("This bird CAN'T fly!",bird1.fly());
    }

    @Test
    public void canFly_true() {
      assertEquals("This bird can fly!", bird2.fly());
    }

    @Test
    public void canLayEggs() {
      assertEquals(true,bird1.layEggs());
    }

}