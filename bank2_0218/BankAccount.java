package bank2_0218;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in); 
	User user;  //주소값을 주면 BankService에서 만든 값으로찾아갈수있음.
	
	public BankAccount(User user){
		this.user=user;
	}
	//계좌생성,조회
	public void creatAccount() { //계좌하나 발급한다고하면 객체를생성하는것
		UserVO vo=new UserVO();  //회원정보입력을 받기위한거
		System.out.println("이름?");
		String name=sc.next();
		System.out.println("전화번호?");
		String tel=sc.next();
	
	//개인정보입력
		vo.setName(name);
		vo.setTel(tel);
		
	//계좌생성
	//계좌번호 1인1계좌/전화번호=계좌번호/잔액=0
		vo.setAccount(tel);
		vo.setMoney(0);
	//저장
		user.append(vo);
	}
	
	public void viewAccount(String account) {
	//	user.getList();//유저들 정보 반환됨
		UserVO[] list =user.getList(); //기존의 정보가 저장되있는거(고객정보(배열)가져오는거)
		int count =user.getCount();
		for(int i=0;i<count;i++) {//배열은 0부터 시작이니깐
			UserVO v=list[i];
			String vac=v.getAccount();
		//	if(v.getAccount().equals(account)) {
			if(v.getAccount().equals(account)) {//계좌번호 반환됨 	//스트링으로 저장한걸 가져오겠다 //입력된것만 돌게
		//계좌번호가 일치하면 
				System.out.println(v);
		
			}
	}
	
	}
}
