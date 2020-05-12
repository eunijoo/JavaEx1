package test0203;

import java.util.Scanner;

public class IfQuiz7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		int total;
		double ave;
		String name;
		
		System.out.println("이름?");
		name = sc.next();
		
		System.out.println("세과목 점수 입력");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		total = a+b+c;
		ave=(double)total/3; //실수이니깐 double로 형변환 시킴.
		
		/*if(40<=a && 40<=b && 40<=c && 60<=ave) {
			System.out.println("합격");
		}else if(60<=ave && 40>a || 40>b || 40>c) {  //맞는방법이지만 조건식은 최대한 줄이는게 좋다.
			System.out.println("과락");
		}else {
			System.out.println("불합격");
		}*/
		if(40<=a && 40<=b && 40<=c && 60<=ave) {
			System.out.println(name+"합격");
		}else if(ave<60) { 
			System.out.println(name+"불합격");
		}else {
			System.out.println(name+"과락");
		}
		sc.close();	
	}

}
