package test0217;

import java.util.Random;
//1 ~ 9까지 서로다른 세자리 수를 구하고 싶다.
//최소 123 ~ 최대 987
public class Random_Class_EX17 {
	
//1~9 까지 난수발생(서로다른 세자리)
	public static int toComputer(){	
		Random rnd=new Random();
		int a,b,c;		
		a=rnd.nextInt(9)+1; //1~9까지 난수발생
		//a와 b의 수가 다른수
		do {   //a와 b의 숫자가 다르게
			b=rnd.nextInt(9)+1;
		}while(a==b);
		//c는 a와 b수와 다른수
		do {
			c=rnd.nextInt(9)+1;
		}while(b==c || c==a);
		
		return a*100+b*10+c;	
	}
//서로 다른 3자리수 인지 확인
	public static boolean isNumberFormat3(int num) {
		
		if(num<100 || num>1000) {
			return false;
		}
		
		int a=num/100;  	//100의 자리
		int b=(num/10)%10;	//10의 자리
		int c=num%10;		//1의 자리
			
		return a!=b && a!=c && b!=c;
	}
	
//난수이용해서 5자리 출력	
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
