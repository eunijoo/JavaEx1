package test0203;

import java.util.Scanner;

public class WhileEx18 {
	public static void main(String[] args) {
	//������ �Է¹޾� 1���� �Է¹��������� Ȧ���� ���ٿ� 5���� ���,�������� �ձ��ϱ�
	 Scanner sc=new Scanner(System.in);
	 
	 int num;
	 int n,s,cnt; //n: Ȧ�����ϴ°� s:�� �ձ��ϴ°�
	 
	 System.out.println("����?");
	 num=sc.nextInt();
	 
	 n=1;
	 s=0;
	 cnt=0;
	 
	 while(n <= num) {  //1���� num���� Ȧ����
		//n++;
	 	s+=n;
	 	System.out.print(n+"\t");
	 	cnt++;// Ȧ�� ��� ���� ī��Ʈ
	 	if(cnt%5==0) {//���ٿ� 5�� ��������� ���γѱ��
	 		System.out.println();
	 	}
	 	n+=2;//Ȧ�������
	 }
	 if(cnt%5 !=0) {//5�� �������� ������ ������.5���� �ƴҶ��� ������ �޾� �������Ѱ���.
	 	System.out.println();
	 }

	 System.out.println("���: "+s);
	 sc.close();
	 
	}
}
