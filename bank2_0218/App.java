package bank2_0218;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		BankService b= new BankService();  //클래스 호출
		
		int ch ;
		while(true) {
			do {
				System.out.println("1.가입");
				System.out.println("2.조회");
				System.out.println("3.");
				System.out.println("4.");
				ch = sc.nextInt();
			}while(ch<1||ch>5);
			
			if(ch==5)
				break;
			
			switch(ch) {
			case 1: //객체생성
				b.creat(); //호출
				break;
				
			case 2: //계좌조회 
				b.view();
				break;
				
			case 3:	//입금
				break;
				

			}

				
				
			}
			
		}

	}


