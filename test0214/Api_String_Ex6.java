package test0214;
/*  ������ ���ڿ��� �Է¹޾� �����ϴ� ���α׷��� �ۼ�
	������ +,-,*,/ �� ����
	��, ���ڴ� ��ȣ�� ����.
  	�߰��� ������ �Է°����ϸ� ������ �����Ŀ� �����Ѵ�.
  	���ڿ����� ������ �Է¹ޱ� ���ؼ��� nextLine()�� ����ؾ���.
  
<����> 3+5
 3+5=8
  
<����>30 - 10
 30-10-20
*/

import java.util.Scanner;

public class Api_String_Ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		
		System.out.println("����[�� : 5+3]?");
		s=sc.nextLine();
		
		s=s.replaceAll("\\s","");
		for(String op : new String[] {"+","-","*","/"}) {
			int pos =s.indexOf(op); //ó������ ��ȣ�� ã�´�.
		//	System.out.println(pos+"..."); //
			if(pos>0) {
				//123+52
				//1> ������ ��ġ ã��
				//2> 
				//3> �ε��� ������(�����ڰ� ���� �˾Ƴ�)  
				//4> ����.���� �з�(���� 0,pos  =>0���� pos���� / ���� pos,1 => pos���� 1���� )
			/*
				System.out.println(pos); //�ش�Ǵ� ������ ��ġ 	//3
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
