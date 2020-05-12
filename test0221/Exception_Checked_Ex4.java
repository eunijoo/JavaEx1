package test0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Checked_Ex4 {
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
			
		} catch (IOException e) {  //checked 예외
			e.printStackTrace();
			
		}catch (NumberFormatException e) {  //
	//NumberFormatException : checked 예외
		// 					    반드시 catch할 필요없지만 예외 발생하면 프로그램은 비정상종료.
		//					    문자열을 숫자로 변경 불가능한 경우에 발생. 
			
		//	System.out.println("숫자만 입력가능합니다.");
		//	System.out.println(e.toString());    //java.lang.NumberFormatException: For input string: "a"
		//	System.out.println(e.getMessage());  //For input string: "a" (왜안되는지 알려줌)
			
			e.printStackTrace();  	//에러를 자세하게 출력해줌(개발자가 보는 에러)
			
		}catch (ArithmeticException e) {
	//ArithmeticException : unchecked 예외.
		
			System.out.println("0으로 나울수없습니다");		 
		}catch (Exception e) {
			//Exception : 모든 예외를 다 catch 가능.
			// 			    여러 예외를 catch한 경우 가장 마지막에 기술해야 함.
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}