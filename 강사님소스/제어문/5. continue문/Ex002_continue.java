import java.util.Scanner;

public class Ex002_continue {
	public static void main(String[] args) {
/*
		5���� �Ǽ��� �Է� �޾� 0���� ū���� �ձ��ϱ�.
*/
		Scanner sc=new Scanner(System.in);
		double input, sum;
		sum=0;
		
		for(int i=1; i<=5; i++) {
			System.out.print("�� ? ");
			input = sc.nextDouble();
			if(input <= 0.0)
				continue;
			
			sum+=input;
		}
		System.out.println("��� : "+sum);
		
		sc.close();
	}
}
