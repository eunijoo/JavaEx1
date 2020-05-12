package test0131;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		// 세 수를 입력받아 적은수에서 큰수 순으로 출력
		Scanner sc=new Scanner(System.in);
		int a,b,c,t;
		
		System.out.println("숫자 3개?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	
		if(a>b) {
			t=a; a=b; b=t;  //a와  b를 비교해서 작은수를 a에 저장. 변수 t를 통해서 a값과 b값을 바꾼다.
		}
	
		if(a>c) {
			t=a; a=c;c=t;//a와  c를 비교해서 작은수를 a에 저장. 변수 t를 통해서 a값과 c값을 바꾼다.
		}
		
		if(b>c) {
			t=b; b=c; c=t;//b와  c를 비교해서 작은수를 b에 저장. 변수 t를 통해서 b값과 c값을 바꾼다.
		}
	
		System.out.println(a+","+b+","+c);
		
		sc.close();	
	}

}
