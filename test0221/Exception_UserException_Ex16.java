package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_UserException_Ex16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User16 user=new User16();
	
		try {
			System.out.println("�̸�");
			user.setName(sc.next());
			System.out.println("����?");
			user.setAge(sc.nextInt());
			
			System.out.println(user.getName()+":"+user.getAge());
		} catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		} catch (AgeValidException e) {
			System.out.println("�����Է¿�������..");
		} catch(Exception e) {
		System.out.println(e.toString());
		}finally {
			sc.close();
		}
		System.out.println("end...");
	}
}
//����� ���� ����Ŭ����//�޼��� �������� ������ ��������
class AgeValidException extends Exception {

	private static final long serialVersionUID = 1L; //�ø����ȣ�� �´��� Ȯ�����ִ� �Լ�(�� �Ⱥٿ��� �����Ϸ��� �˾Ƽ� ����)

	public AgeValidException(String msg){ //������
		super(msg);
	}
	
}

class User16{
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
	public void setAge(int age) throws AgeValidException {  //���� ���� ���ܸ� ����
		if(age<0) {
			throw new AgeValidException("���̴� 0���� ũ�ų� ���ƾ��Ѵ�.");
		}
				
		this.age = age;
	}
		
}