package months;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonthParserTest {

  @Test
  public void parseMonth_january() throws Exception {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(1);
    assertEquals("January", month.name);
    assertEquals(31, month.days);
  }

  @Test
  public void parseMonth_febraury() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(2);
    assertEquals("February", month.name);
    assertEquals(28, month.days);
  }

  @Test
  public void parseMonth_mars() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(3);
    assertEquals("Mars", month.name);
    assertEquals(31, month.days);
  }

  @Test
  public void parseMonth_april() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(4);
    assertEquals("April", month.name);
    assertEquals(28, month.days);
  }
  @Test
  public void parseMonth_mai() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(5);
    assertEquals("May", month.name);
    assertEquals(31, month.days);
  }
  @Test
  public void parseMonth_june() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(6);
    assertEquals("June", month.name);
    assertEquals(30, month.days);
  }
  @Test
  public void parseMonth_juli() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(7);
    assertEquals("July", month.name);
    assertEquals(31, month.days);
  }
  @Test
  public void parseMonth_august() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(8);
    assertEquals("August", month.name);
    assertEquals(31, month.days);
  }
  @Test
  public void parseMonth_september() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(9);
    assertEquals("September", month.name);
    assertEquals(28, month.days);
  }
  @Test
  public void parseMonth_october() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(10);
    assertEquals("October", month.name);
    assertEquals(31, month.days);
  }
  @Test
  public void parseMonth_November() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(11);
    assertEquals("November", month.name);
    assertEquals(30, month.days);
  }
  @Test
  public void parseMonth_Desember() {
    MonthParser monthParser = new MonthParser();
    Month month = monthParser.parseMonth(12);
      assertEquals("Desember", month.name);
    assertEquals(31, month.days);
  }


}