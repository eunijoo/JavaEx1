package join_0219;

import java.util.Scanner;

public class MemberService extends Member{  //Member :아버지 / MemberService:자식
	
	private Scanner sc=new Scanner(System.in);
	private MemberResult mr=new MemberResult(this); //this : 멤버서비스 객체 (ms객체) 
//입력받는 메소드	
	public void input() {
		System.out.println("\n데이터입력...");
		MemberVO vo=new MemberVO();
		
		System.out.println("아이디");
		vo.setId(sc.next());
		
		System.out.println("패스워드:");
		vo.setPwd(sc.next());
		
		System.out.println("이름 :");
		vo.setName(sc.next());
		
		System.out.println("생년월일 : ");
		vo.setBirth(sc.next());
		
		int result = append(vo);  //append 아버지꺼니깐 내 마음대로 부를 수 있음(상속받음)		
		if(result==-1) {
			System.out.println("정원초과...\n");
		}else {
			System.out.println("가입완료...\n");
		}
	
	}
//출력하는 메소드	
	public void print() {
		System.out.println("\n데이터 출력...");
		mr.write();
	}
//아이디찾는 메소드	
	public void findById() {
		System.out.println("\n아이디검색...");
		String  id;
		System.out.println("검색할 아이디 :  ");
		id=sc.next();
		
		MemberVO vo=get(id);
		if(vo==null) {
			System.out.println("등록된 아이디가 아닙니다.");
		}else {
			System.out.println(vo);
		}
		System.out.println();
	}
}