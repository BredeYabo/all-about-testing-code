import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmoothieBarTest {

  SmoothieBar smoothieBar = new SmoothieBar();


  @Test
  public void canBlendOrangeAndAppleSmoothie() {
    Smoothie smoothie = smoothieBar.blend(SmoothieKind.OrangeAndAppleSmoothie);
    assertTrue(smoothie.getKind() == SmoothieKind.OrangeAndAppleSmoothie);
  }

  @Test
  public void blendingOrangeAndAppleSmoothieConsumesOrangesAndApples() {
    Smoothie smoothie = smoothieBar.blend(SmoothieKind.OrangeAndAppleSmoothie);
    assertEquals("Wrong number of apples", 0, smoothieBar.getApplesInStock());
    assertEquals("Wrong number of oranges", 0, smoothieBar.getOrangesInStock());
  }

  @Test(expected = IllegalStateException.class)
  public void blendingOrangeAndAppleSmoothieConsumesOrangesAndApples_withsize1000() {
    Smoothie smoothie = smoothieBar.blend(SmoothieKind.OrangeAndAppleSmoothie, 1000);
    assertTrue(smoothieBar.getApplesInStock() == 0);
    assertTrue(smoothieBar.getOrangesInStock() == 0);
  }

  @Before
  public void init() {
    final int APPLES = 2;
    final int ORANGES = 2;
    smoothieBar.restockApples(APPLES);
    smoothieBar.restockOranges(ORANGES);
  }


}