import java.util.Scanner;

public class Quiz105_Calendar {
	public static void main(String[] args) {
/*
		��, ���� �Է� �޾� �޷��� ����ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);

		int year, month, days, week;
		int total;

		do{
			System.out.print("�⵵ ? ");
			year=sc.nextInt();
		} while(year < 1);

		do{
			System.out.print("�� ? ");
			month=sc.nextInt();
		} while(month < 1 || month > 12);

		days=31;
		if(month==4||month==6||month==9||month==11) {
			days=30;
		} else if(month==2){
			if(year%4==0&&year%100!=0||year%400==0)
				days=29;
			else
				days=28;
		}

		int n;
		total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		for(int i=1; i<month; i++) {
			n=31;
			if(i==4||i==6||i==9||i==11) {
				n=30;
			} else if(i==2){
				if(year%4==0&&year%100!=0||year%400==0)
					n=29;
				else
					n=28;
			}

			total+=n;
		}

		total+=1;

		week=total%7;

		System.out.printf("\n\t%d�� %d��\n", year, month);
		System.out.println("   ��   ��   ȭ   ��   ��   ��   ��");
		System.out.println("============================");

		for(int i = 0; i < week; i++)
			System.out.print("    ");

		for(int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);

			if(++week%7 == 0)
				System.out.println();
		}

		if(week%7 !=0)
			System.out.println();
		System.out.println("============================");
		
		sc.close();
	}
}
