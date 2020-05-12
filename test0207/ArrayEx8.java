package test0207;

import java.util.Arrays;

public class ArrayEx8 {
	//1~45
	//(int)(Math.ranom()*45+1;  -> for문써서 6번 발생
	public static void main(String[] args) {
		//int []num=new int[6];
		int[]a= {4,6,8,34,33,10};
		Arrays.sort(a);  //순차적으로 정렬해주는 함수
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
