package member_0225;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int ch;
		Member mm=new MemberImpl();
		
		try {
			while(true) {
				do {
					System.out.println("1.ȸ������  2.ȸ������Ʈ 3.�������� 4.ȸ��Ż�� 5.�̸��� �˻�  6. �̸��˻�  7.����=>");
					ch=sc.nextInt();
				}while(ch<1 || ch>7);
				if(ch==7) break;
				
				switch(ch) {
				case 1:mm.input(); break;
				case 2:mm.print(); break;
				case 3:mm.update(); break;
				case 4:mm.delete(); break;
				case 5:mm.findByEmail();break;
				case 6:mm.findByName(); break;
				}
			}
		} finally {
			sc.close();
		}	
	}
}
