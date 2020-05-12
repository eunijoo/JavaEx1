public class Quiz203_Add25 {
	public static void main(String[] args) {
/*		
		a+b+c=25
*/
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					if (a + b + c == 25) {
						System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
					}
				}
			}
		}
	}
}
