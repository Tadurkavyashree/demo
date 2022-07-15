package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assertion1 {
  @Test
  public void f() {
	  Assert.assertTrue(true);
  }
  @Test
  public void f1() {
	  String str="kavyashree";
	  Assert.assertFalse(str.contains("shree"));
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
