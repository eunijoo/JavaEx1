package friend_0224;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	Friend fr= new FriendImpl();
	int ch;
	
	try {
		while(true) {
			do {
				System.out.println("1.��� 2.��� 3.�̸��˻� 4.���� 5.���� 6.����=>");
				ch=sc.nextInt();
			}while(ch<1||ch>6);
			
			if(ch==6) break;
			
			switch(ch) {
			case 1:fr.input(); break;
			case 2:fr.print(); break;
			case 3:fr.findByName(); break;
			case 4:fr.update(); break;
			case 5:fr.delete(); break;
			}
		}
		}finally {
			sc.close();
		}
	}
}