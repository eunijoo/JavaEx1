package join_0219;

import java.util.Scanner;

public class MemberService extends Member{  //Member :�ƹ��� / MemberService:�ڽ�
	
	private Scanner sc=new Scanner(System.in);
	private MemberResult mr=new MemberResult(this); //this : ������� ��ü (ms��ü) 
//�Է¹޴� �޼ҵ�	
	public void input() {
		System.out.println("\n�������Է�...");
		MemberVO vo=new MemberVO();
		
		System.out.println("���̵�");
		vo.setId(sc.next());
		
		System.out.println("�н�����:");
		vo.setPwd(sc.next());
		
		System.out.println("�̸� :");
		vo.setName(sc.next());
		
		System.out.println("������� : ");
		vo.setBirth(sc.next());
		
		int result = append(vo);  //append �ƹ������ϱ� �� ������� �θ� �� ����(��ӹ���)		
		if(result==-1) {
			System.out.println("�����ʰ�...\n");
		}else {
			System.out.println("���ԿϷ�...\n");
		}
	
	}
//����ϴ� �޼ҵ�	
	public void print() {
		System.out.println("\n������ ���...");
		mr.write();
	}
//���̵�ã�� �޼ҵ�	
	public void findById() {
		System.out.println("\n���̵�˻�...");
		String  id;
		System.out.println("�˻��� ���̵� :  ");
		id=sc.next();
		
		MemberVO vo=get(id);
		if(vo==null) {
			System.out.println("��ϵ� ���̵� �ƴմϴ�.");
		}else {
			System.out.println(vo);
		}
		System.out.println();
	}
}