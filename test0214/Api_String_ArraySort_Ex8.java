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
		
		String[] ss= {"����","�λ�","�뱸","��õ","����","����"};
		
		System.out.println("sort �� : ");
		print(ss);
		
		Arrays.sort(ss);
		
		System.out.println("sort �� : ");
		print(ss);
	}
}
