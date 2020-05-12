public class Ex003_continue {
	public static void main(String[] args) {
/*
		continue label ¿¹Á¦
*/

/*
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					continue;
				}
				System.out.println("i:"+i+", j:"+j);
			}
		}
*/

		jump:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					continue jump;
				}
				System.out.println("i:"+i+", j:"+j);
			}
		}
	}
}
