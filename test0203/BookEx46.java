package test0203;

import java.util.Scanner;

public class BookEx46 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int m;
		
		System.out.println("���� ���� �Է��ϼ���.");
		m=sc.nextInt();
		
		switch(m) {
		case 3: case 4: case 5:
			System.out.println("��"); break;
		case 6: case 7: case 8:
			System.out.println("����");break;
		case 9: case 10: case 11:
			System.out.println("����");break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�");break;
		}
		
	
		sc.close();
	
	}
}
