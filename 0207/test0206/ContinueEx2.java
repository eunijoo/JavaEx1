package test0206;

import java.util.Scanner;

public class ContinueEx2 {

public static void main(String[] args) {
		//5���� Ȧ���� �Է¹޾� �Է¹��� Ȧ���� �ձ��ϱ�.
		//��, �Է¹��� ���� 0���� ���ų� ¦���̸� �ٽ� �Է� �ޱ�
		Scanner sc=new Scanner(System.in);

		int s,n,i;  //s:�հ躯�� , n:�Է¹޴º��� , i: � �Է��� �޾Ҵ��� ����
		s=i=0;
		System.out.println("0�̻��� 5���� Ȧ�� �Է�...");
		while(i<5) {
			n=sc.nextInt();
//			i++
			if(n<0 || n%2==0) {  //0���� �۰ų� ¦���̸� �ٽ� while������ �ö�.(���Է�)
//				i--;
				continue;
			}
			i++;
			s+=n;  //Ȧ�� �� ���
		}		
		System.out.println("��� : "+s);
		sc.close();
	}
	

}
