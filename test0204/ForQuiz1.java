package test0204;

import java.util.Scanner;
//������ �Է¹޾� 1���� �Է¹��� �������� ���� ���ϴ� ���α׷��ۼ�.
public class ForQuiz1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,s,num; //n:�������� , s: �����հ� , num : �Է¹޴� ���� ����
		s=0; //�հ�0���� �����̿��� 0���� �ʱ�ȭ
	
	//do-while������ �� ���� �ڵ� ����.			
		do {   //������ �ѹ��� �� ����
			System.out.println("���� �Է�:");
			num=sc.nextInt(); // �Է¹��� �Լ�
		}while (1>num||1000<num); ////�Է¹��� ���� 1�̸� 1000�ʰ��϶� while������ ����
		
		
		for(n=1;n<=num;n++) { //1���� num���� ; 1�� ����
			s+=n; //�����հ� ���
		}
		
		System.out.println("1~"+num+"���� �� : "+s); 
		sc.close();
	}
}
		
	
	

	



