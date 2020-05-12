package bank2_0218;

import java.util.Scanner;

public class BankService {	//모든기능을 관리
	//계좌생성 //계좌조회 
	Scanner sc=new Scanner(System.in); 
	User user=new User();  //객체생성 
	BankAccount ba=new BankAccount(user); //인스턴스변수(단 한번 생성을 하고 계속 쓰겠다.)
	
	public void creat() {
		//계좌생성
		ba.creatAccount();
		
		//처리
	}
	public void view() {
		
		//꼐좌 조회
		System.out.println("계좌번호입력");
		String account =sc.next();
		//처리
		ba.viewAccount(account);
	
		
	}
	
	
	
	
	
	//입금 //출금
	
	
}
