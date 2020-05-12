package test0129;

import java.util.Scanner; //java 폴더에 util안에 scanner를 가져와줌
public class InputEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //Scanner는 키보드로 입력을 받는 클래스
										  //객체생성							
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("이름?");
		name=sc.next();     //next는 문자열 입력(입력시 중간에 공백 입력 불가능)
		System.out.print("나이?");
		age=sc.nextInt();   // nextInt는 정수만 입력
		System.out.print("성별[M/F]?");
		gender=sc.next().charAt(0); //문자입력
		System.out.print("키?");
		height=sc.nextDouble();  //실수입력
		
	    System.out.println("이름: "+name);
	    System.out.println("나이: "+age);
	    System.out.println("성별: "+gender);
	    System.out.println("키: " +height);
	    
	    sc.close(); //Scanner를 닫는다.
	}

}
