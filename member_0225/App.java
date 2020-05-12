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
					System.out.println("1.회원가입  2.회원리스트 3.정보수정 4.회원탈퇴 5.이메일 검색  6. 이름검색  7.종료=>");
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
