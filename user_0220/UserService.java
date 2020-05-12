package user_0220;

import java.util.Scanner;

public class UserService {
	private Scanner sc=new Scanner(System.in);
	private User user =new User();
	private UserResult ur= new UserResult(user); //생성자를 이용하여 의존관계 설정
	
	public void input() {
		System.out.println("\n자료등록");	
		
		UserVO vo=new UserVO();
		
		System.out.println("이름?");
		vo.setName(sc.next());
		
		System.out.println("나이");
		vo.setAge(sc.nextInt());
		
		user.append(vo);
		
		System.out.println("등록완료\n");
	}
		
	public void print() {
		ur.write();
	}		
}


