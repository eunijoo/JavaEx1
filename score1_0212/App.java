package score1_0212;

import java.util.Scanner;

//성적처리(50명 넘으면 오류처리)
//프로그램 실행하면 다음과같이문구가 뜨게 1.입력 2.출력 3.검색 4.삭제 5.종료
//입력받는 내용(데이터입력) : 학번,이름,국어,영어,수학
//출력내용 : 성적처리:학번.이름,국.영,수,총점,평점,환산점수,등수
//검색내용 : 이름입력하면 해당 성적출력
//--------------------------------------------------------
//데이터 : 학번,이름,점수[3](국,영,수),총점,석차,인원수(몇명입력했는지 알아야해서)
//		=>최대 50개
//기능 : 입력,출력,검색,삭제,총점,평균,평점

public class App {  
//main(메뉴작성)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		
		ScoreService ss = new ScoreService();
		
		while(true) {
			do {
				System.out.println("1.입력 2.출력 3.검색 4.삭제 5.종료=>");
				ch=sc.nextInt();
			}while(ch<1||ch>5);
			
			if(ch==5) {
				break;
			}
			switch(ch) {
			case 1:ss.input(); break;	  	//입력값1이면 input
			case 2:ss.print(); break;		//입력값2이면 print
			case 3:ss.findByName(); break;	//입력값3이면 findByName
			case 4:ss.delete(); break;	  	//입력값4이면 delete
			}
		}
		sc.close();
	}
}
