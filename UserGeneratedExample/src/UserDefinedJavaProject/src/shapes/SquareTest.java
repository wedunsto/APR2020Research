package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {
 	@Test
  	public void test01() {
    		assertEquals(9, new Square().close_to_zero(10));
  	}

  	@Test
 	public void test02() {
    		assertEquals(99, new Square().close_to_zero(100));
  	}

  	@Test
  	public void test03() {
    		assertEquals(0, new Square().close_to_zero(0));
  	}

  	@Test
  	public void test04() {
    		assertEquals(-9, new Square().close_to_zero(-10));
  	}
	/*@Test
	public void test01(){
		assertEquals(2, new Square().closeToTwo(3));
	}

	@Test
	public void test02(){
		assertEquals(0, new Square().closeToTwo(1));
	}

	@Test
	public void test03(){
		assertEquals(4, new Square().closeToTwo(5));
	}

	@Test
	public void test04(){
		assertEquals(0, new Square().closeToTwo(0));
	}

	@Test
	public void test01(){
		assertEquals(false,new Square().IsPositive(-4));
	}

	@Test
	public void test02(){
		assertEquals(false,new Square().IsPositive(-4));
	}

	@Test
	public void test03(){
		assertEquals(false,new Square().IsPositive(-4));
	}

	@Test
	public void test04(){
		assertEquals(false,new Square().IsPositive(4));
	}	
	@Test
	public void test01(){
		assertEquals(true,new Square().EqualSides(5,5,5,5));
	}

	@Test
	public void test02(){
		assertEquals(true,new Square().EqualSides(5,5,5,5));
	}

	@Test
	public void test03(){
		assertEquals(true,new Square().EqualSides(5,5,5,5));
	}

	@Test
	public void test04(){
		assertEquals(true,new Square().EqualSides(5,5,5,5));
	}
	private Square testSquare = new Square(); //Create an object of the class under test
	
	@Test
	void SidesTest() {//Test if all the sides are equal
		boolean result = testSquare.EqualSides(5,5,5,5);
		assertEquals(result,true);
	}
	
	@Test
	void AngleTest() {//test if all the angles are 90 degrees
		boolean result = testSquare.EqualAngles(90,90,90,90);
		assertEquals(result,true);
	}
	
	@Test
	void ConnectedXCoordinateTest() {//test if square is connected
		boolean result = testSquare.ConnectedXCoordinate(0,0,5,5);
		assertEquals(result, true);
	}
	
	@Test
	void ConnectedYCoordinateTest() {//test if square is connected
		boolean result = testSquare.ConnectedYCoordinate(0,5,5,0);
		assertEquals(result, true);
	}*/
}
