package test0221;

import java.util.Scanner;

/* try_catch
 * try����  ctrl+space �ȿ� ����ֱ�
 * => error ���� �Է��ϸ� "�Է� ������ �ùٸ��� �ʰų�.." �޼��� ��
 * 
 * 
 */

public class Exception_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			System.out.print("�� ����? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println(a + " / " + b + " = " + c); 

		} catch (Exception e) {	//������ �����ÿ��� catch������ ����	// but, ��Ȳ���� � �������� ���� �˷������� ����.
			System.out.println("�Է� ������ �ùٸ��� �ʰų�...");
		}

		System.out.println("end...");

		sc.close();
	}
}
