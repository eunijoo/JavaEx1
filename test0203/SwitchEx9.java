package test0203;
/*
두수와 연산자를 입력받아 출력.
 */
import java.util.Scanner;

public class SwitchEx9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		String oper;
		
		System.out.println("두수?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("연산자?");
		oper=sc.next();
		
		switch(oper) {
		case"+" : System.out.println(n1+"+"+n2+"="+(n1+n2)); break;
		case"-" : System.out.println(n1+"-"+n2+"="+(n1-n2)); break;
		case"*" : System.out.println(n1+"*"+n2+"="+(n1*n2)); break;
		case"/" : System.out.println(n1+"/"+n2+"="+(n1/n2)); break;
		}
		
		
		sc.close();
	
	}
}
