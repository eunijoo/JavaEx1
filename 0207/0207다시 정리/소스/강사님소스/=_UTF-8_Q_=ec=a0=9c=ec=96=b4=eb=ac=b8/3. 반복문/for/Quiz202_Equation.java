public class Quiz202_Equation {
	public static void main(String[] args) {
/*		
		������ 3x+6y=27�� ��� �ظ� ���ϴ� ���α׷�.
		��, x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10 �̴�.
*/		
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if(3*x+6*y==27)
                    System.out.println("["+x+","+y+"]");
			}
		}
	}
}
