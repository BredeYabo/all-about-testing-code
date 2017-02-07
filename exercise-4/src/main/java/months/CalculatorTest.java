package months;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  @Test
  public void add_twoPlusThree_returnsFive() {
    Calculator calc = new Calculator();
    int result = calc.add(2, 3);
    assertEquals(5, result);

  }

}
