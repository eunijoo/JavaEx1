package test0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Checked Exception(체크 예외)
 * : 컴파일러에 의해 체크되는 예외 
 * 
 * UnChecked Exception(언체크 예외)
 * : 런타임시 발생되는 예외
 *    
 */

public class Exception_Checked_Ex3 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader : 한번에 한줄을 입력받는 것
		// System.in: 키보드,	System.out: 모니터 라고 생각하기
		
		String s;
		
		int a,b,c;
		
		 
		 try {
			System.out.println("첫번째 수? ");
			s= br.readLine();	// checked 예외 : 예외처리를 하지않으면 사용할 수 없음을 의미 
			//readLine()은 checked exception이 발생하므로 반드시 예외처리를 해야함 : IOException
			a= Integer.parseInt(s);
			
			System.out.println("두번째 수? ");
			b = Integer.parseInt(br.readLine());
                			
			c= a / b;
	
			System.out.println(a+"/"+b+"="+c);
		 } catch (IOException e) {
			 //IOException :입출력에 문자가 발생할때 발생하는 예외.
			 //	checked 예외로 반드시 예외처리를 해야한다.
			 //	checked exception 은 메소드를 정의할 때 throw한 예외
			 //	예외처리를 하지 않으면 컴파일 오류가 발생하는 예외
			e.printStackTrace();
		}	
		 System.out.println("end...");
	}
}
