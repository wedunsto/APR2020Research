package testPackage;

public class KGenProgPractice {
	/**
	   * 整数をゼロに一つ近づけるメソッド
	   * A method that brings an integer closer to zero
	   * 
	   * bug: 0を与えたときに0であるべきが1になる
	   * bug: should be 0 but give 1
	   * 
	   * fix1: バグ行を削除<br>
	   * fix1: Delete bug line<br>
	   * fix2: バグ行の次に 'n--;' を追加<br>
	   * fix2: After the bug line 'n--;' Add<br>
	   * fix3: バグ行を 'return n;' で置換
	   * fix3: Bug line 'return n;' replace with
	   * 
	   * @param n
	   * @return
	   */
	  public int close_to_zero(int n) {
	    if (n == 0) {
	      n++; // bug here
	      //return n;
	      //n--;
	    } else if (n > 0) {
	      n--;
	    } else {
	      n++;
	    }
	    return n;
	  }
	  
	  public void main(String[] args) {
		  System.out.println(close_to_zero(10));
	  }
	  
}
