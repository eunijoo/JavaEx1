package test0217;

import java.util.Random;
//1 ~ 9���� ���δٸ� ���ڸ� ���� ���ϰ� �ʹ�.
//�ּ� 123 ~ �ִ� 987
public class Random_Class_EX17 {
	
//1~9 ���� �����߻�(���δٸ� ���ڸ�)
	public static int toComputer(){	
		Random rnd=new Random();
		int a,b,c;		
		a=rnd.nextInt(9)+1; //1~9���� �����߻�
		//a�� b�� ���� �ٸ���
		do {   //a�� b�� ���ڰ� �ٸ���
			b=rnd.nextInt(9)+1;
		}while(a==b);
		//c�� a�� b���� �ٸ���
		do {
			c=rnd.nextInt(9)+1;
		}while(b==c || c==a);
		
		return a*100+b*10+c;	
	}
//���� �ٸ� 3�ڸ��� ���� Ȯ��
	public static boolean isNumberFormat3(int num) {
		
		if(num<100 || num>1000) {
			return false;
		}
		
		int a=num/100;  	//100�� �ڸ�
		int b=(num/10)%10;	//10�� �ڸ�
		int c=num%10;		//1�� �ڸ�
			
		return a!=b && a!=c && b!=c;
	}
	
//�����̿��ؼ� 5�ڸ� ���	
	public static String toComputer5() {
		StringBuilder sb=new StringBuilder();
		Random rnd=new Random();
		int n;
		for(int i=0;i<5;i++) {
			//n=(int)(Math.random()*10);
			n=rnd.nextInt(10);
			sb.append(n);
		}
		return sb.toString();
	}
//main	
	public static void main(String[] args) {
		System.out.println(toComputer());
	//	System.out.println(isNumberFormat3());
		System.out.println(toComputer5());
	
	}
}
