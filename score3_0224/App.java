package score3_0224;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Score ss= new ScoreImpl();  //Score은 인터페이스여서 new옆에 못옴.
		int ch;

		try {
			while (true) {
				do {
					System.out.println("1.입력 2.출력 3.학번검색 4.이름검색 5.수정 6.삭제 7.종료=>");
					ch=sc.nextInt();
				}while(ch<1||ch>7);
					
				if(ch==7);
				
				switch (ch) {
				case 1: ss.input(); break;
				case 2: ss.print(); break;
				case 3: ss.findByHak(); break;
				case 4: ss.findByName(); break;
				case 5: ss.updata(); break;
				case 6: ss.remove(); break;
				}
			}
			
		} finally {
			sc.close();
		}
	}

}
