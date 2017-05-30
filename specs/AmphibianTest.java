import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import zoo.*;
import enums.*;

public class AmphibianTest {
  Amphibian amphibian;

  @Before
  public void before() {
    ArrayList<String> foodAmphibian = new ArrayList<String>(Arrays.asList("insects", "worm", "water snails"));
    amphibian = new Amphibian("frog", AgeType.ADULT, foodAmphibian,
      "wetland", "jumping");
  }

  @Test
  public void classExists() {
    assertThat(amphibian, instanceOf(Amphibian.class));
  }

  @Test
  public void canHavePermeableSkin() {
    assertEquals("I can breath through my skin!",amphibian.permeableSkin());
  }


}