package test0204;

import java.util.Scanner;

public class ForQuiz7 {
//�ΰ��� ������ �Է¹޾� �Է¹��� �� �� ���������� ū������(�� ������ ����)�� 
//3�� ����̰ų� 5�� ����� ������ �հ� ����� ����ϴ� ���α׷�.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,num1,num2,s; //n:�������� num1,num2: �Է¹޴������� ����. s:�հ� ����
		int cnt,ave; //cnt:���ڼ��� ����. ave: ��պ���
		
		System.out.println("�� ����");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2) { //num2�� num1���� ������ �� ��� num1���� num2���� �ٲ��� 
			n=num1; num1=num2;num2=n; //n�̶�� ������ �̿��ؼ� ���� ����			
		}
		s=cnt=0; //�հ躯���� ���ڼ��ִ� ������ 0���� �����ؾ��ϴϱ� 0���� �ʱ�ȭ
		for(int i=num1;i<=num2;i++) {
			if(i%3==0 || i%5==0) { //3�Ǵ� 5�� ����� �ձ����ִ� ����
				s+=i; 
				cnt++;
			}	
		}	
		ave=(int)(s/cnt);
		System.out.println("�� : "+s);
		System.out.println("��� : "+ave);
		sc.close();
	}
}


