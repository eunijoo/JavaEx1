package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Finally_Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		
		try {
			System.out.println("�� ��?");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println(c);
		}catch (InputMismatchException e) {
			//	InputMismatchException : unchecked����
			//							 Scanner�� nextInt()��� ���ڰ� �ƴ� ���ڿ��� �Է��� ��� �߻�					
			System.out.println("���� �Է� �����մϴ�.");
			
			e.printStackTrace(); //���������� ��Ȯ�ϰ� ��µ�.
		} finally {
			System.out.println("���ܿ� ������� ����...");
			sc.close();
		}
	}
}