import java.util.Scanner;

public class Quiz001_continue {
	public static void main(String[] args) {
/*
	5���� Ȧ���� �Է� �޾� �Է� ���� Ȧ���� �� ���ϱ�.
	��. �Է� ���� ���� 0���� ���ų� ¦���̸� �ٽ� �Է� �޴´�.
*/

		Scanner sc=new Scanner(System.in);

/*
		int s, n, i;
		
		System.out.println("0 �̻��� 5�� Ȧ�� �Է�...");
		s=i=0;
		while(i<5) {
			n=sc.nextInt();
			if(n<0 || n%2==0) {
				continue;
			}
			i++;
			s+=n;
		}
		System.out.println("���:"+s);
*/		

		int s, n;
		System.out.println("0 �̻��� 5�� Ȧ�� �Է�...");
		s=0;
		for(int i=1; i<=5; i++) {
			n=sc.nextInt();  
			if(n<0 || n%2==0) {
				i--;
				continue;
			}
			s+=n;
		}
		System.out.println("���:"+s);

		sc.close();
	}
}
