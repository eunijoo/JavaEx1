package test0203;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		
		System.out.println("영어로 요일(mon, tue, wed, thu, fri, sat, sun) ?");
		s=sc.next();
		
		switch(s) { // String 도 가능(7.0 부터)
		case "mon" : System.out.println("월요일"); break;
		case "tue" : System.out.println("화요일"); break;
		}
		
		sc.close();
	}
}
