import java.util.Scanner;

public class Quiz104_Weekday {
	public static void main(String[] args) {
/*
		��, ��, ���� �Է� �޾� �ش� ������� ������ ����ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);

		int year, month, day, days, w;
		int total;
		String week;

		do{
			System.out.print("�⵵ ? ");
			year=sc.nextInt();
		} while(year < 1900);

		do{
			System.out.print("�� ? ");
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
			System.out.print("�� ? ");
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
			week="��";
		else if(w==1)
			week="��";
		else if(w==2)
			week="ȭ";
		else if(w==3)
			week="��";
		else if(w==4)
			week="��";
		else if(w==5)
			week="��";
		else if(w==6)
			week="��";

		System.out.printf("%d�� %d�� %d���� %s���� �Դϴ�.\n",
			 year, month, day, week);
		sc.close();
	}
}
