package test0203;

import java.util.Scanner;

public class BookEx48 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		char num;
		
		System.out.println("�ֹι�ȣ�Է�");
		num=sc.next().charAt(7); // 8��° ���� �����ϰ�,�����´�.
		
		switch(num) {
		case '1': case '3': // ���ڷ� �����߱⶧���� '����'�� �ۼ� 
			System.out.println("�����Դϴ�"); break;
		case '2': case '4':
			System.out.println("�����Դϴ�"); break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		sc.close();
	
	}
}
