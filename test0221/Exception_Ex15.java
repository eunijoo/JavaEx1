package test0221;

import java.util.Scanner;

//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_Ex15 {

	public static void main(String[] args) {// main�� javaVM�� �θ� // ���ܸ� ȣ���Ѿ����� ���ѱ�ڴ�.
		Scanner sc=new Scanner(System.in);
		User15 user=new User15();
	
		try {
			System.out.println("�̸�");
			user.setName(sc.next());
			System.out.println("����?");
			user.setAge(sc.nextInt());
			
			System.out.println(user.getName()+":"+user.getAge());
		} catch (Exception e) {
			System.out.println("�Է¿����Դϴ�.");
		}finally {
			sc.close();
		}
		System.out.println("end...");
	}
}

class User15{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<10) {
			throw new Exception("���̴� 0���� ũ�ų� ���ƾ��Ѵ�.");
		}
		
		
		this.age = age;
	}
	
	
}