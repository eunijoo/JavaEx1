import java.util.Scanner;

public class Quiz102_MaxMin {
	public static void main(String[] args) {
/*	
		5���� ����(0~10)�� �Է¹޾� �ִ������� �ּ������� �� ���� ���ϴ� ���α׷�
*/	
		Scanner sc=new Scanner(System.in);
		int score[] = new int[5];
		int max, min;
		int tot, result;

		tot = 0;
		for(int i=0; i<score.length; i++) {
			do {
				System.out.print((i + 1)+ "��° ���� : ");
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 10);
			tot += score[i];
		}
		
		max = min = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i])
				max = score[i];
			else if(min > score[i])
				min = score[i];
		}
		
		result = tot - max - min;
		
		System.out.print("\n���� ����Ʈ : ");
		for(int n : score)
			System.out.printf("%5d", n);
		System.out.println("\n��� ���� : " + result);
		
		sc.close();
	}
}
