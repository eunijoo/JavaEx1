package test0204;

import java.util.Scanner;

//�� ������ �Է¹޾� �Է¹��� �� �� ���������� ū�������� ���� ���ϴ� ���α׷� �ۼ�.
public class While_IfQuiz6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,temp;
		int s,n;
		
		System.out.println("�μ�?");
		n1=sc.nextInt(); //���� �Է�
		n2=sc.nextInt();//�����Է�
		
		s=0;
		n=n1;
		
		if(n1>n2) { //�������� ū���� ���ؼ� n2�� ���� ��� n1���� ���� �������ִ� ����
			temp=n1; //temp(���)������ n1���־���
			n1=n2;  //n1(���)
			n2=temp;
		}
		while(n<=n2) { //�Է¹��� n2 ���� �����ִ� ����.
			s+=n;
			n++;		
		}
		System.out.println(n1+"~"+n2+"������ �� : "+s);
		
		sc.close();
	}
}


