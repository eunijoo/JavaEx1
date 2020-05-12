import java.util.Scanner;

public class Quiz101_Tti {

	public static void main(String[] args) {
/*	
		년도를 입력 받아 입력 받은 년도에 대한 띠를 출력하는 프로그램
*/	
		Scanner sc = new Scanner(System.in);
		String t[]={"원숭이", "닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		int year;
		String s;
		
		do {
			System.out.print("년도 ? ");
			year = sc.nextInt();
		} while(year < 1900);
		
		s=t[year % 12];
		
		System.out.println(year+"년도는 " + s+"띠 의 해입니다.");
		
		sc.close();
	}
}
