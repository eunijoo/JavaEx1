package test0204;

import java.util.Scanner;
//1-9 ������ ������ �Է¹޾� �Է¹��� ���� �������� ����ϴ� ���α׷�.
public class ForQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,num,s; //n: ��������, num:�Է¹����� ����,s:���������庯��
		s=1; //s�� �����̿��� �ּҰ� 1�� �ʱ�ȭ����.
		do {  //������ �ѹ��� �����.
			System.out.println("��?");
			num=sc.nextInt();	
		}while(num<1 || num>9); //num�� 1�̸�,9�ʰ��϶� �Է¹��� �ݺ��ȴ�.
		
		for(n=1;n<=9;n++) { //1�ܺ���9�ܱ��� ;1�� ����
			s=(num*n); //�������� s������ ����.
			System.out.println(num +"*"+n+"="+s);//�����ݺ������� ����ؾ��ؼ� for���ȿ� ��.	
		}
		sc.close();
	}
}
		
	
	

	



