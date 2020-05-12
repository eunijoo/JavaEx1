import java.util.Scanner;

public class Quiz102_MaxMin {
	public static void main(String[] args) {
/*	
		5개의 점수(0~10)를 입력받아 최대점수와 최소점수를 뺀 합을 구하는 프로그램
*/	
		Scanner sc=new Scanner(System.in);
		int score[] = new int[5];
		int max, min;
		int tot, result;

		tot = 0;
		for(int i=0; i<score.length; i++) {
			do {
				System.out.print((i + 1)+ "번째 점수 : ");
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
		
		System.out.print("\n점수 리스트 : ");
		for(int n : score)
			System.out.printf("%5d", n);
		System.out.println("\n취득 점수 : " + result);
		
		sc.close();
	}
}
