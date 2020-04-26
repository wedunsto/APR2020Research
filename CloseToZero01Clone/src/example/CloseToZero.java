package example;

public class CloseToZero {
	public boolean close_to_zero(int n) {
		//even or odd function
		//return true for even number, false for odd number
		boolean results = true;
		if(n%2 == 0){
			results = false;//bug here
		}
		else{
			results = false;
		}
		return results;
	}
}
