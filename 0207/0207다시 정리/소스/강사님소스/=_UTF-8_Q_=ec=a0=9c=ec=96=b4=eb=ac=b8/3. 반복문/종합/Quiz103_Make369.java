public class Quiz103_Make369 {
	public static void main(String[] args) {
/*
		- 369 ����
		  1~100 ���� ���� 3, 6, 9�� ��� �ִ� ���� * �� ����ϰ�
		  ��Ÿ ���ڴ� �ش� ���ڸ� ���ٿ� 10���� ����ϴ� ���α׷�
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
