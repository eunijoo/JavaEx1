package test0131;

import java.util.Scanner;

public class OperEx7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//�ѹ��ڸ� �Է¹޾� �ҹ����̸� �빮�ڷ�.
		//�빮���̸� �ҹ��ڷ� ��ȯ�ϰ� ���� ��ҹ��ڰ� �ƴϸ�
		//�Է¹��� ���ڸ� �״�� ����Ѵ�.
		//'A' =65 , 'a'=97
		
		char a,b;
		//a='A';
		//b=(char)(a+32); //��ҹ��� �ƽ�Ű�ڵ尪�� 32���̰� ��.
		//System.out.println(b);
		
		System.out.println("�ѹ���?");
		a=sc.next().charAt(0);
	  //�빮��->�ҹ���, �ҹ���->�빮��,��Ÿ->��Ÿ
	  //b= a>='A'&&a<='Z' ? (char)(a+32) : (char)(a-32);//�빮�ڿ������ǹ� ? �ҹ��ڷιٲ��� : �빮�ڷ� �ٲ���
		b= a>='A'&&a<='Z' ? (char)(a+32) : (a>='a'&&a<'z' ? (char)(a-32):a);
		 //  �빮�ڿ������ǹ�  ?   �ҹ��ڷιٲ��� :    �ҹ��ڿ������ǹ�       ?      �ҹ���:    �Է±״��
		
		System.out.println(a+"->"+b);
		
		sc.close();
	}

}
