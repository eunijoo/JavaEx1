import java.util.Scanner;

public class Ex009_Weekday {
	public static void main(String[] args) {
/*	
		년, 월, 일을 입력 받아 입력 받은 날짜에 대한 요일을 출력하는 프로그램
*/
		Scanner sc=new Scanner(System.in);

		int [] day_of_month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] week = new String[]{"일", "월", "화", "수", "목", "금", "토"};
		
		int year, month, day;
		int totDays;
		int w;
		int i;

		do {
			System.out.print("년도  ? ");
			year = sc.nextInt();
		} while(year < 1900);

		do {
			System.out.print("월  ? ");
			month = sc.nextInt();
		} while(month < 1 || month > 12);

		if((year%4 == 0 && year%100 !=0) || year%400 == 0) {
			day_of_month[1] = 29;
		} else {
			day_of_month[1] = 28;
		}

		do {
			System.out.print("일  ? ");
			day = sc.nextInt();
		} while(day < 1 || day > day_of_month[month-1]);

		totDays = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		for(i = 0; i < month-1; i++)
			totDays += day_of_month[i];
		totDays += day;

		w=totDays%7;

		System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n",
			year, month, day, week[w]);
		
		sc.close();
	}
}
