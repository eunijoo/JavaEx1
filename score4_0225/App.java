package score4_0225;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch;
	Score ss=new ScoreImpl();
	
	try {
		while(true) {
			do {
				System.out.println("1.입력 2.수정 3.삭제 4.출력 5.학번검색 6.이름검색 7.종료=>");
				ch=sc.nextInt();
			}while(ch<1 || ch>7);
			
			if(ch==7) break;
			
			switch (ch) {
			case 1: ss.input(); break;
			case 2: ss.update(); break;
			case 3: ss.delete(); break;
			case 4: ss.print(); break;
			case 5: ss.findByHak(); break;
			case 6: ss.findByName(); break;
			}
		}	
	} finally {
		sc.close();
	}
}
}
