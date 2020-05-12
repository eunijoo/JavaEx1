package test0214;

import java.util.Arrays;

public class Api_String_ArraySort_Ex8 {
	public static void print(String[] ss) {
		for(String s:ss) {
			System.out.println(s+"  ");
		}
		System.out.println();
}
	
	public static void main(String[] args) {
		
		String[] ss= {"서울","부산","대구","인천","광주","대전"};
		
		System.out.println("sort 전 : ");
		print(ss);
		
		Arrays.sort(ss);
		
		System.out.println("sort 후 : ");
		print(ss);
	}
}
