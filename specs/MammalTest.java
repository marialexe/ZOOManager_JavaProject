import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;


import zoo.*;

public class MammalTest {
  Mammal mammal;

  @Before
  public void before() {
    mammal = new Mammal("Tiger","adult");
  }

  @Test
  public void canGetClass() {
    // assertEquals(Mammal, mammal.getClass());
    assertThat(mammal, instanceOf(Mammal.class));
  }
}