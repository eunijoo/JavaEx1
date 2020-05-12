package test0205;

public class ForEx7 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" "); // °ø¹éÇÑÄ­
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>0; j--) {
				System.out.print(j<=i+1?"*":" ");
			}
			System.out.println();
		}
/*
    *
   **
  ***
 ****
*****
*/
		

	}

}
