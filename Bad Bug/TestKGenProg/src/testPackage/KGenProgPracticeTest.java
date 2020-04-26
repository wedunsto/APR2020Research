package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KGenProgPracticeTest {
	@Test
	  public void test01() {
	    assertEquals(9, new KGenProgPractice().close_to_zero(10));
	  }

	  @Test
	  public void test02() {
	    assertEquals(99, new KGenProgPractice().close_to_zero(100));
	  }

	  @Test
	  public void test03() {
	    assertEquals(0, new KGenProgPractice().close_to_zero(0));
	  }

	  @Test
	  public void test04() {
	    assertEquals(-9, new KGenProgPractice().close_to_zero(-10));
	  }
}
