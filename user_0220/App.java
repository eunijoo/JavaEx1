package user_0220;

import java.util.Scanner;
//ȭ�� ����
public class App {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	UserService us= new UserService();
	int ch;
	
	while(true) {
		do {
			System.out.println("1.�Է� 2.��� 3.���� =>");
			ch=sc.nextInt();
			
		}while(ch<1 || ch>3);
		
		if(ch==3) {
			break;
		}
		
		switch(ch) {
		case 1: us.input(); break;
		case 2: us.print(); break;
		}
	}
	sc.close();
	}
}
