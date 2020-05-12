public class Quiz202_Equation {
	public static void main(String[] args) {
/*		
		방정식 3x+6y=27의 모든 해를 구하는 프로그램.
		단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
*/		
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if(3*x+6*y==27)
                    System.out.println("["+x+","+y+"]");
			}
		}
	}
}
