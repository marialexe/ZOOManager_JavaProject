import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import zoo.*;
import enums.*;

public class ZooTest{
  Zoo zoo;
  ArrayList<Enclosure> enclosures;
  Enclosure polar;
  Enclosure savanna;
  Enclosure jungle;

  @Before
  public void before(){
    enclosures = new ArrayList<Enclosure>();
    zoo = new Zoo("Edinburgh Zoo", enclosures);
  }

  @Test
  public void zooClassExist() {
    assertThat(zoo, instanceOf(Zoo.class));
  }

  @Test
  public void canGetName() {
    assertEquals("Edinburgh Zoo",zoo.getName());
  }

  @Test
  public void zeroEnclosuresInitially() {
    assertEquals(0,zoo.getEnclosures().size());
  }

  @Test
  public void canAddEnclosure() {
    zoo.addEnclosure(polar);
    zoo.addEnclosure(savanna);
    zoo.addEnclosure(jungle);
    assertEquals(3,zoo.getEnclosures().size());
  }

  @Test
  public void canRemoveEnclosure() {
    zoo.addEnclosure(polar);
    zoo.addEnclosure(savanna);
    zoo.addEnclosure(jungle);
    zoo.removeEnclosure(savanna);
    zoo.removeEnclosure(polar);
    assertEquals(1,zoo.getEnclosures().size());
  }
  
}