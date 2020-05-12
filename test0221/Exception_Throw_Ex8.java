package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Throw_Ex8 {
	public static void main(String[] args) {
		User8 u = new User8();
		u.intput();
	}
}

class User8 {

	private Scanner sc = new Scanner(System.in);
	
		// throws Exception : �޼ҵ带 ȣ���� ������ Exception checked ���ܸ� catch�ϵ��� ����.
	private int inputScore() throws Exception {  //ȣ���� input�� �� ������ �� ������Ƽ����. 	
												 //(������ ������ ������ �ִٰ� inputScore()�� ȣ���� input()���� �˷������)
		int result = 0;
		
		try {
			result = sc.nextInt();  //������ ������ Ȯ���ϰ� �������Ѵ�.
			
			if(result<0 || result>100) {  //throws : ȣ���ʿ��� ����������� �˷��ִ°�  throw : ���ܸ� �߻���Ű�°� (��������Ű�°�)
				
				//���ܴ���. ������ �����ϰ� ȣ���Լ��ʿ��� ���ܸ� �߻���Ŵ.
				throw new Exception("������ 0~100���̸� �����մϴ�.");
			}
			
		} catch (InputMismatchException e) {
			//System.out.println("���ڸ� �Է°����մϴ�.");
			
			sc.nextLine();  //������ �ִ� �����͸� �о ����. nextLine : �����б�
			//���ܸ� ��������� �߻��Ѵ�.
			throw new Exception("���ڸ� �Է°����մϴ�.");
		}
		return result;
	}

	public void intput() {  //
		String name, tel;
		int kor, eng;

		try {
		
		System.out.println(" �̸�?");
		name = sc.next();

		System.out.println(" ���� ?");
		kor = inputScore();
		
		System.out.println("����?");
		eng = inputScore();
		
		System.out.println("��ȭ��ȣ ? ");
		tel = sc.next();   //���ڿ��Է±����̿������� �߸��Է��� ���ڿ��� ���⼭ �о����.

		System.out.println(name + ":" + kor + ":" + eng + ":" + tel);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=====================");		
		}
}