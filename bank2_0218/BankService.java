package bank2_0218;

import java.util.Scanner;

public class BankService {	//������� ����
	//���»��� //������ȸ 
	Scanner sc=new Scanner(System.in); 
	User user=new User();  //��ü���� 
	BankAccount ba=new BankAccount(user); //�ν��Ͻ�����(�� �ѹ� ������ �ϰ� ��� ���ڴ�.)
	
	public void creat() {
		//���»���
		ba.creatAccount();
		
		//ó��
	}
	public void view() {
		
		//���� ��ȸ
		System.out.println("���¹�ȣ�Է�");
		String account =sc.next();
		//ó��
		ba.viewAccount(account);
	
		
	}
	
	
	
	
	
	//�Ա� //���
	
	
}
