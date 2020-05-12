package test0131;

import java.util.Scanner;

public class OperEx8 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int y;
		String s;
		
		System.out.println("년도?");
		y=sc.nextInt();
		
		//년도가 4의배수이고,100의 배수가 아니거나,400의 배수이면 윤년. 그렇지 않으면 평년
		//변수 = 조건 ? 참일때 : 거짓일때
		
		s= (y%4==0 && y%100!=0 || y%400==0) ? "윤년"  : "평년" ; 
		System.out.println(y+":"+s);
					
		sc.close();

	}
}