public class Ex003_break {
	public static void main(String[] args) {
/*
		break label ¿¹Á¦
*/

/*		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					break;
				}
				System.out.println("i:"+i+", j:"+j);
			}
		}
*/
		
		gogo:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					break gogo;
				}
				System.out.println("i:"+i+", j:"+j);
			}
		}
	}
}
