import java.util.Scanner;

public class Ex002_break {
	public static void main(String[] args) {
/*
		�Ǽ��� �Է� �޾� �Է� ���� ���� �ձ��ϱ�. 0���ϸ� �Է��ϸ� ����
*/
		Scanner sc=new Scanner(System.in);
		double input, sum;
		sum=0;
		
		while(true) {  // ���ѷ���
			System.out.print("�� ? ");
			input = sc.nextDouble();
			if(input <= 0.0)
				break;
			
			sum+=input;
		}
		System.out.println("��� : "+sum);
		
		sc.close();
	}
}
