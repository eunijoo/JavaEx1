public class Quiz103_Make369 {
	public static void main(String[] args) {
/*
		- 369 게임
		  1~100 까지 수중 3, 6, 9가 들어 있는 수는 * 를 출력하고
		  기타 숫자는 해당 숫자를 한줄에 10개씩 출력하는 프로그램
*/
		int count = 0;
		for (int n = 1; n <= 100; n++) {
			count = 0;
			if ((n / 10) >= 3 && (n / 10) % 3 == 0)
				count++;
			if ((n % 10) >= 3 && (n % 10) % 3 == 0)
				count++;

			if (count >= 1)
				System.out.print("    *");
			else
				System.out.printf("%5d", n);

			if (n % 10 == 0)
				System.out.println();
		}
	}
}
