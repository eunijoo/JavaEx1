import java.util.Scanner;

public class Quiz104_Weekday {
	public static void main(String[] args) {
/*
		년, 월, 일을 입력 받아 해당 년월일의 요일을 출력하는 프로그램
*/
		Scanner sc=new Scanner(System.in);

		int year, month, day, days, w;
		int total;
		String week;

		do{
			System.out.print("년도 ? ");
			year=sc.nextInt();
		} while(year < 1900);

		do{
			System.out.print("월 ? ");
			month=sc.nextInt();
		} while(month < 1 || month > 12);

		days=31;
		if(month==4||month==6||month==9||month==11)
			days=30;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0)
				days=29;
			else
				days=28;
		}

		do{
			System.out.print("일 ? ");
			day=sc.nextInt();
		} while(day < 1 || day > days);

		int n;
		total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		for(int i=1; i<month; i++) {
			n=31;

			if(i==4||i==6||i==9||i==11)
				n=30;
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0)
					n=29;
				else
					n=28;
			}

			total+=n;
		}
		total+=day;

		w=total%7;

		week="";
		if(w==0)
			week="일";
		else if(w==1)
			week="월";
		else if(w==2)
			week="화";
		else if(w==3)
			week="수";
		else if(w==4)
			week="목";
		else if(w==5)
			week="금";
		else if(w==6)
			week="토";

		System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n",
			 year, month, day, week);
		sc.close();
	}
}
