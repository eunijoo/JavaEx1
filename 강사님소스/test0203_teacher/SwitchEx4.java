package test0203;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		
		System.out.println("����� ����(mon, tue, wed, thu, fri, sat, sun) ?");
		s=sc.next();
		
		switch(s) { // String �� ����(7.0 ����)
		case "mon" : System.out.println("������"); break;
		case "tue" : System.out.println("ȭ����"); break;
		}
		
		sc.close();
	}
}
