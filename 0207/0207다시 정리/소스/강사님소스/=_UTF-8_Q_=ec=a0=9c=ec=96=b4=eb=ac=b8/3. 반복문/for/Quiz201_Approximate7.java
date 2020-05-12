import java.util.Scanner;

public class Quiz201_Approximate7 {
	public static void main(String[] args) {
/*		
		5개의 숫자를 입력 받아 7에 가장 가까운수 출력
		6과 8처럼 7에 가까운수가 동일한 경우 먼저 입력한 수를 출력
*/
		Scanner sc = new Scanner(System.in);
		int n, diff, min = 999, result = 0;

		System.out.println("5개의 숫자를 입력 하세요...");
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();

			diff = n > 7 ? n=7 : 7-n;

			if (i == 0 || min > diff) {
				min = diff;
				result = n;
			}
		}

		System.out.println("7에 가장 가까운수 : " + result);
		sc.close();
		
/*
		5개의 숫자를 입력 받아 7에 가장 가까운수 출력(7은 다시 입력)
*/
/*		
		Scanner sc=new Scanner(System.in);
		int n, diff, min=999, result=0;
		System.out.print("5개의 수를 입력하세요.[7은 다시 입력]...");
		for(int i=1; i<=5; i++) {
			n=sc.nextInt();
			if(n==7) {
				i--;
				continue;
			}
			
			diff = n > 7 ? n=7 : 7-n;
			
			if(i==1 || min > diff) {
				min = diff;
				result = n;
			}
		}
		System.out.println("가장 가까운수 : "+ result);
		
		sc.close();
*/		
	}
}
