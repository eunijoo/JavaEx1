package test0203;

import java.util.Scanner;

public class IfQuiz5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h,pay; 
		
		System.out.println("근무시간?");
		h=sc.nextInt();
		
		if(h>8) {
			pay =8*10000 + (int)((h-8)*10000*1.5); //실수를 갖을 수 없으니 int(정수)로 형변환	
		}else {
			pay =h*10000;
		}
		
		System.out.printf("급여 : %,d\n",pay); // 금액단위마다 ,입력
		
		sc.close();	

	}

}
