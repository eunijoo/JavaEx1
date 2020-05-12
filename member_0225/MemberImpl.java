package member_0225;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemberImpl implements Member{
	private Scanner sc=new Scanner(System.in);
	
//키:이메일 , 값:멤버브이오 객체
	private Map<String, MemberVO> map =new HashMap<>();
	
//회원가입	
	@Override
	public void input() {
		// 이메일(키), 패스워드,이름 ,전화번호,생년월일
		// 이메일 중복체크
		System.out.println("회원가입...\n");
		String email;
		
		System.out.println("이메일 입력");
		email=sc.next();
		
		if(map.containsKey(email)) {
			System.out.println("등록한 이메일입니다.\n");
			return;
		}
		try {
		MemberVO vo=new MemberVO();
		System.out.println("이름? ");
		vo.setName(sc.next());
		
		System.out.println("패스워드? ");
		vo.setPwd(sc.next());
		
		System.out.println("전화번호? ");
		vo.setTel(sc.next());
		
		System.out.println("생년월일? ");
		vo.setBirth(sc.next());
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력가능합니다.\n");
			sc.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		//이메일,이름,전화번호,생년월일(나이)
		System.out.println("회원리스트...\n");
		
		System.out.println("인원 수 :" +map.size());
		Iterator<String> it = map.keySet().iterator();
	//	Set<String> set=map.keySet();
	//	Iterator<String> it=set.iterator();
	
		while(it.hasNext()) {
			String email=it.next();
			MemberVO vo=map.get(email);
			
			System.out.print(email+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getPwd()+"\t");
			System.out.print(vo.getTel()+"\t");
			System.out.print(vo.getBirth()+"\t");

		}
		System.out.println();
		}

	@Override
	public void update() {
		// 아이디입력
		// 데이터검색 => 존재하면 패스워드 입력 -> 일치하면 수정 가능.
		// 데이터없거나 패스워드 일치하지 않으면 오류메세지 후,메인 메뉴로 돌아가기.
		System.out.println("회원정보 수정...\n");
		String email,pwd;
		
		System.out.println("수정할 이메일?");
		email=sc.next();
		
		System.out.println("패스워드?");
		pwd=sc.next();
		
		MemberVO vo=map.get(email);
		
		if(vo==null || !vo.getPwd().equals(pwd)) {
			System.out.println("이메일 또는 패스워드가 일치하지 않습니다.\n");
			return;
		}
		try {	
			System.out.println("패스워드? ");
			vo.setPwd(sc.next());
			
			System.out.println("전화번호? ");
			vo.setTel(sc.next());
			
			System.out.println("생년월일? ");
			vo.setBirth(sc.next());
			
			System.out.println("수정완료");
			
			}catch(InputMismatchException e) {
				System.out.println("숫자만 가능합니다.");
				sc.nextLine();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void delete() {
		// 아이디입력
		// 데이터 검색 => 존재하면 패스워드 입력 => 일치하면 삭제
		// 데이터없거나 패스워드 일치하지 않으면 오류메세지 후,메인 메뉴로 돌아가기.
		System.out.println("회원탈퇴...\n");
		String email,pwd;
		System.out.println("삭제할 이메일?");
		email=sc.next();
		System.out.println("패스워드?");
		pwd=sc.next();
		
		MemberVO vo=map.get(email);
		
		if(vo==null || !vo.getPwd().equals(pwd)) {
			System.out.println("이메일 또는 패스워드가 일치하지 않습니다.\n");
			return;
		}
		map.remove(email);
		System.out.println("회원탈퇴가 정상적으로 처리되었습니다.");
	}

	@Override
	public void findByEmail() {
		// 
		System.out.println("\n 이메일 검색...");
		
		String email;
		System.out.println("검색할 이메일?");
		email=sc.next();
		
		MemberVO vo=map.get(email);
		
		if(vo==null) {
			System.out.println("이메일이 일치하지 않습니다.\n");
			return;
		}
		System.out.print(email+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getPwd()+"\t");
		System.out.print(vo.getTel()+"\t");
		System.out.print(vo.getBirth()+"\t");

		System.out.println();
	
	}

	@Override
	public void findByName() {
		// TODO Auto-generated method stub
		System.out.println("\n 이름검색...");
		String name;
		
		System.out.println("검색할 이름?");
		name=sc.next();
		
		boolean b=false;
		
		Iterator<String> it=map.keySet().iterator();
		
		while(it.hasNext()) {
			String email=it.next();
			MemberVO vo=map.get(email);
			
			if(vo.getName().startsWith(name)) {
				System.out.print(email+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getPwd()+"\t");
				System.out.print(vo.getTel()+"\t");
				System.out.print(vo.getBirth()+"\t");
				
				b=true;
			}
		}
		if(! b) {
			System.out.println("일치하는 이름이 없습니다.\n");
		}
		System.out.println();
	}

}
