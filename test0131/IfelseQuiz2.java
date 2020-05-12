package test0131;

import java.util.Scanner;

public class IfelseQuiz2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int y;
		
		System.out.println("년도");
		y=sc.nextInt();
		
		if((y%4==0) && (y%100 !=0) || (y%400==0)) {
			System.out.println(y+": 윤년");
		} else {
			System.out.println(y+": 평년");
		}	
		sc.close();

	}

}
