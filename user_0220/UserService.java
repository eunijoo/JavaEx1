package user_0220;

import java.util.Scanner;

public class UserService {
	private Scanner sc=new Scanner(System.in);
	private User user =new User();
	private UserResult ur= new UserResult(user); //�����ڸ� �̿��Ͽ� �������� ����
	
	public void input() {
		System.out.println("\n�ڷ���");	
		
		UserVO vo=new UserVO();
		
		System.out.println("�̸�?");
		vo.setName(sc.next());
		
		System.out.println("����");
		vo.setAge(sc.nextInt());
		
		user.append(vo);
		
		System.out.println("��ϿϷ�\n");
	}
		
	public void print() {
		ur.write();
	}		
}


