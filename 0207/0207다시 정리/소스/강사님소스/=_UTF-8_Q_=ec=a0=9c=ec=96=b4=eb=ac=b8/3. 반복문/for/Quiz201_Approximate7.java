import java.util.Scanner;

public class Quiz201_Approximate7 {
	public static void main(String[] args) {
/*		
		5���� ���ڸ� �Է� �޾� 7�� ���� ������ ���
		6�� 8ó�� 7�� �������� ������ ��� ���� �Է��� ���� ���
*/
		Scanner sc = new Scanner(System.in);
		int n, diff, min = 999, result = 0;

		System.out.println("5���� ���ڸ� �Է� �ϼ���...");
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();

			diff = n > 7 ? n=7 : 7-n;

			if (i == 0 || min > diff) {
				min = diff;
				result = n;
			}
		}

		System.out.println("7�� ���� ������ : " + result);
		sc.close();
		
/*
		5���� ���ڸ� �Է� �޾� 7�� ���� ������ ���(7�� �ٽ� �Է�)
*/
/*		
		Scanner sc=new Scanner(System.in);
		int n, diff, min=999, result=0;
		System.out.print("5���� ���� �Է��ϼ���.[7�� �ٽ� �Է�]...");
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
		System.out.println("���� ������ : "+ result);
		
		sc.close();
*/		
	}
}
