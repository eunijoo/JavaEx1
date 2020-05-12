package member_0225;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemberImpl implements Member{
	private Scanner sc=new Scanner(System.in);
	
//Ű:�̸��� , ��:������̿� ��ü
	private Map<String, MemberVO> map =new HashMap<>();
	
//ȸ������	
	@Override
	public void input() {
		// �̸���(Ű), �н�����,�̸� ,��ȭ��ȣ,�������
		// �̸��� �ߺ�üũ
		System.out.println("ȸ������...\n");
		String email;
		
		System.out.println("�̸��� �Է�");
		email=sc.next();
		
		if(map.containsKey(email)) {
			System.out.println("����� �̸����Դϴ�.\n");
			return;
		}
		try {
		MemberVO vo=new MemberVO();
		System.out.println("�̸�? ");
		vo.setName(sc.next());
		
		System.out.println("�н�����? ");
		vo.setPwd(sc.next());
		
		System.out.println("��ȭ��ȣ? ");
		vo.setTel(sc.next());
		
		System.out.println("�������? ");
		vo.setBirth(sc.next());
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է°����մϴ�.\n");
			sc.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		//�̸���,�̸�,��ȭ��ȣ,�������(����)
		System.out.println("ȸ������Ʈ...\n");
		
		System.out.println("�ο� �� :" +map.size());
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
		// ���̵��Է�
		// �����Ͱ˻� => �����ϸ� �н����� �Է� -> ��ġ�ϸ� ���� ����.
		// �����;��ų� �н����� ��ġ���� ������ �����޼��� ��,���� �޴��� ���ư���.
		System.out.println("ȸ������ ����...\n");
		String email,pwd;
		
		System.out.println("������ �̸���?");
		email=sc.next();
		
		System.out.println("�н�����?");
		pwd=sc.next();
		
		MemberVO vo=map.get(email);
		
		if(vo==null || !vo.getPwd().equals(pwd)) {
			System.out.println("�̸��� �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.\n");
			return;
		}
		try {	
			System.out.println("�н�����? ");
			vo.setPwd(sc.next());
			
			System.out.println("��ȭ��ȣ? ");
			vo.setTel(sc.next());
			
			System.out.println("�������? ");
			vo.setBirth(sc.next());
			
			System.out.println("�����Ϸ�");
			
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �����մϴ�.");
				sc.nextLine();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void delete() {
		// ���̵��Է�
		// ������ �˻� => �����ϸ� �н����� �Է� => ��ġ�ϸ� ����
		// �����;��ų� �н����� ��ġ���� ������ �����޼��� ��,���� �޴��� ���ư���.
		System.out.println("ȸ��Ż��...\n");
		String email,pwd;
		System.out.println("������ �̸���?");
		email=sc.next();
		System.out.println("�н�����?");
		pwd=sc.next();
		
		MemberVO vo=map.get(email);
		
		if(vo==null || !vo.getPwd().equals(pwd)) {
			System.out.println("�̸��� �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.\n");
			return;
		}
		map.remove(email);
		System.out.println("ȸ��Ż�� ���������� ó���Ǿ����ϴ�.");
	}

	@Override
	public void findByEmail() {
		// 
		System.out.println("\n �̸��� �˻�...");
		
		String email;
		System.out.println("�˻��� �̸���?");
		email=sc.next();
		
		MemberVO vo=map.get(email);
		
		if(vo==null) {
			System.out.println("�̸����� ��ġ���� �ʽ��ϴ�.\n");
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
		System.out.println("\n �̸��˻�...");
		String name;
		
		System.out.println("�˻��� �̸�?");
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
			System.out.println("��ġ�ϴ� �̸��� �����ϴ�.\n");
		}
		System.out.println();
	}

}
