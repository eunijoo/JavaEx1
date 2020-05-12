package test0214;
/*  수식을 문자열로 입력받아 연산하는 프로그램을 작성
	연산은 +,-,*,/ 만 가능
	단, 숫자는 부호가 없다.
  	중간에 공백이 입력가능하며 공백은 제거후에 연산한다.
  	문자열에서 공백을 입력받기 위해서는 nextLine()를 사용해야함.
  
<수식> 3+5
 3+5=8
  
<수식>30 - 10
 30-10-20
*/

import java.util.Scanner;

public class Api_String_Ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		
		System.out.println("수식[예 : 5+3]?");
		s=sc.nextLine();
		
		s=s.replaceAll("\\s","");
		for(String op : new String[] {"+","-","*","/"}) {
			int pos =s.indexOf(op); //처음부터 기호를 찾는다.
		//	System.out.println(pos+"..."); //
			if(pos>0) {
				//123+52
				//1> 연산자 위치 찾음
				//2> 
				//3> 인덱스 가져옴(연산자가 뭔지 알아냄)  
				//4> 좌측.우측 분류(우측 0,pos  =>0부터 pos까지 / 좌측 pos,1 => pos부터 1까지 )
			/*
				System.out.println(pos); //해당되는 연산자 위치 	//3
				System.out.println(s.charAt(pos));			//'+'
				System.out.println(s.substring(0,pos));		//"123"
				System.out.println(s.substring(pos+1));		//"52"
			*/
				
				int n1=Integer.parseInt(s.substring(0,pos));
				int n2=Integer.parseInt(s.substring(pos+1));
				
				//int result=0;
				String result=null;
				
				switch(op) {
				//case "+" : System.out.println(s+"="+(n1+n2)); break;
				case "+" : result=s + "=" + (n1 + n2 ); break;
				case "-" : result=s + "=" + (n1 - n2 ); break;
				case "*" : result=s + "=" + (n1 * n2 ); break;
				case "/" : result=s + "=" + (n1 / n2 ); break;
				}
				
				System.out.println(result);
				break;
			}
		}
		sc.close();
	}
}
