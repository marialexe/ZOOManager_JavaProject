import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import zoo.*;
import enums.*;

public class FishTest {
  Fish fish;

  @Before
  public void before() {
    ArrayList<String> foodFish = new ArrayList<String>(Arrays.asList("plankton", "fish", "shrimp"));
    fish = new Fish("salmon", AgeType.ADULT, foodFish,
      "river", "swimming");
  }

  @Test
  public void fishClassExists() {
    assertThat(fish, instanceOf(Fish.class));
  }

  @Test
  public void canSwim() {
    assertEquals("I can only swim!",fish.swim());
  }

  @Test
  public void haveNoLegs() {
    assertEquals("Fish have no legs!", fish.noLegs());
  }










}