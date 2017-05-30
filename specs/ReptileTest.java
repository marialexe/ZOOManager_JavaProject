import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import zoo.*;
import enums.*;

public class ReptileTest {
  Reptile reptile;

  @Before
  public void before() {
    ArrayList<String> foodReptile = new ArrayList<String>(Arrays.asList("mammals", "birds", "amphibians"));
    reptile = new Reptile("crocodile", AgeType.ADULT, foodReptile,
      "river", "belly running");
  }

  @Test
  public void doesReptileClassExist() {
    assertThat(reptile,instanceOf(Reptile.class));
  }

  @Test
  public void getColdBlooded() {
    assertEquals(true,reptile.coldBlooded());
  }

  @Test
  public void getBoneyScaleySkin() {
    assertEquals("Reptiles have thick and rugged armoured skin with scales.", reptile.boneyScaleySkin());
  }


}