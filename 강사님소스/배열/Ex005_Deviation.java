import java.util.Scanner;

public class Ex005_Deviation {
	public static void main(String[] args) {
/*		
		5명의 이름과 점수를 입력 받아 편차(수-평균)를 계산하여 출력하고,
		마지막에 총합과 평균을 출력하는 프로그램
*/
		Scanner sc=new Scanner(System.in);
		String[] name=new String[5];
		int []score=new int[5];
		int tot=0;
		double ave, s;

		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+"번째 이름 ? ");
			name[i] = sc.nextLine();
			System.out.print("      점수 ? ");
			score[i] = sc.nextInt();
			sc.nextLine();
			
			tot+=score[i];
		}
		
		ave = (double)tot/score.length;
		System.out.println("\n이름\t점수\t편차");
		System.out.println("--------------------");
		for(int i=0; i<name.length; i++) {
			s=score[i] - ave;
			System.out.println(name[i]+"\t"+score[i]+"\t"+s);
		}
		System.out.println("--------------------");
		System.out.println("총합 : "+tot);
		System.out.println("--------------------");
		System.out.println("평균 : "+ave);
		
		sc.close();
	}
}
