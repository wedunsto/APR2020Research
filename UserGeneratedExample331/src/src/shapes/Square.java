package shapes;

public class Square {
	
	public int close_to_zero(int n) {
    		if (n == 0) {
      			n++; // bug here
    		} else if (n > 0) {
      			n--;
    		} else {
      			n++;
    		}
    		return n;
  	}

	boolean IsPositive(int number){
		boolean positive = true;
		if(number <= 0) positive = false;
		else{
			//bug here insertion required
		}
		return positive;
	}
	/*public boolean EqualSides(int sideLength1, int sideLength2, int sideLength3, int sideLength4) {
		//Confirm all sides of a square are the same
		if((sideLength1 == sideLength2) & (sideLength3 == sideLength4) & (sideLength1 == sideLength3)) return true;
		else return false;
	}
	
	public boolean EqualAngles(double angle1, double angle2, double angle3, double angle4) {
		//Confirm all angles in the square are 90 degrees
		if(angle1 == 90.0 & angle2 == 90.0 & angle3 == 90.0 & angle4 == 90.0) return true;
		else return false;
	}
	
	public boolean ConnectedXCoordinate(int xcoord1, int xcoord2, int xcoord3, int xcoord4) {
		//Confirm the edges of the square are connected
		if((xcoord1 == xcoord2) & (xcoord3 == xcoord4)) return true;
		//The first conditional should be ==
		else return false;
	}
	
	public boolean ConnectedYCoordinate(int ycoord1, int ycoord2, int ycoord3, int ycoord4) {
		//Confirm the edges of the square are connected
		if((ycoord1 == ycoord4) & (ycoord3 == ycoord2)) return true;
		else return false;
	}*/
}