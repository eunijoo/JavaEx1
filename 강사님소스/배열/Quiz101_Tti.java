import java.util.Scanner;

public class Quiz101_Tti {

	public static void main(String[] args) {
/*	
		�⵵�� �Է� �޾� �Է� ���� �⵵�� ���� �츦 ����ϴ� ���α׷�
*/	
		Scanner sc = new Scanner(System.in);
		String t[]={"������", "��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		int year;
		String s;
		
		do {
			System.out.print("�⵵ ? ");
			year = sc.nextInt();
		} while(year < 1900);
		
		s=t[year % 12];
		
		System.out.println(year+"�⵵�� " + s+"�� �� ���Դϴ�.");
		
		sc.close();
	}
}
