public class Quiz206_PerfectNumber {
	public static void main(String[] args) {
/*
		 4~1000 ������ �������� ã�� ����ϴ� ���α׷��ۼ�
		 �������� �ڽ��� ������ ����� ���� ���� ����̴�.
*/
		int sum;
		for (int i = 4; i <= 1000; i++) {
			sum = 0;

			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sum += j;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}
}
