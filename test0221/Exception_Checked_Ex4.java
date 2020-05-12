package test0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Checked_Ex4 {
	public static void main(String[] args) {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
		
		try {
			System.out.println("ù��°��?");
			a=Integer.parseInt(br.readLine());
			
			System.out.println("�ι�°��?");
			b=Integer.parseInt(br.readLine());
			
			c=a/b;
			
			System.out.println(a+"/"+b+"="+c);
			
		} catch (IOException e) {  //checked ����
			e.printStackTrace();
			
		}catch (NumberFormatException e) {  //
	//NumberFormatException : checked ����
		// 					    �ݵ�� catch�� �ʿ������ ���� �߻��ϸ� ���α׷��� ����������.
		//					    ���ڿ��� ���ڷ� ���� �Ұ����� ��쿡 �߻�. 
			
		//	System.out.println("���ڸ� �Է°����մϴ�.");
		//	System.out.println(e.toString());    //java.lang.NumberFormatException: For input string: "a"
		//	System.out.println(e.getMessage());  //For input string: "a" (�־ȵǴ��� �˷���)
			
			e.printStackTrace();  	//������ �ڼ��ϰ� �������(�����ڰ� ���� ����)
			
		}catch (ArithmeticException e) {
	//ArithmeticException : unchecked ����.
		
			System.out.println("0���� ����������ϴ�");		 
		}catch (Exception e) {
			//Exception : ��� ���ܸ� �� catch ����.
			// 			    ���� ���ܸ� catch�� ��� ���� �������� ����ؾ� ��.
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}