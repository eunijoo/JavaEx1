package test0217;

import java.util.Random;

public class Random_Class_EX15 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int n;
		for(int i=1;i<=100;i++) {
			n=rnd.nextInt(100)+1;  		//1~100
			System.out.print(n+"\t");
			if(i%10==0) { 				//10개마다 엔터
				System.out.println();
			}
		}	
	}
}
