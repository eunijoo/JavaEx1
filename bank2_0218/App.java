package bank2_0218;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		BankService b= new BankService();  //Ŭ���� ȣ��
		
		int ch ;
		while(true) {
			do {
				System.out.println("1.����");
				System.out.println("2.��ȸ");
				System.out.println("3.");
				System.out.println("4.");
				ch = sc.nextInt();
			}while(ch<1||ch>5);
			
			if(ch==5)
				break;
			
			switch(ch) {
			case 1: //��ü����
				b.creat(); //ȣ��
				break;
				
			case 2: //������ȸ 
				b.view();
				break;
				
			case 3:	//�Ա�
				break;
				

			}

				
				
			}
			
		}

	}


