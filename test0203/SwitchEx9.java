package test0203;
/*
�μ��� �����ڸ� �Է¹޾� ���.
 */
import java.util.Scanner;

public class SwitchEx9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		String oper;
		
		System.out.println("�μ�?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("������?");
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
