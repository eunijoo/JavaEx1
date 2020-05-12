package test0221;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_Checked_Ex5 {
	public static void main(String[] args) {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
		
		try {
			System.out.println("첫번째수?");
			a=Integer.parseInt(br.readLine());			
			System.out.println("두번째수?");
			b=Integer.parseInt(br.readLine());
			
			c=a/b;			
			System.out.println(a+"/"+b+"="+c);
			
		}catch (Exception e) {   //클라이언트는 문제가 뭔지 모른다. 개발자만 무슨 오류인지 확인가능. =>Exception_Checked_Ex4에서 예외처리한게 더 좋음.
			//Exception : 모든 예외를 다 catch 가능.
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}