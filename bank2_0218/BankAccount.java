package bank2_0218;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in); 
	User user;  //�ּҰ��� �ָ� BankService���� ���� ������ã�ư�������.
	
	public BankAccount(User user){
		this.user=user;
	}
	//���»���,��ȸ
	public void creatAccount() { //�����ϳ� �߱��Ѵٰ��ϸ� ��ü�������ϴ°�
		UserVO vo=new UserVO();  //ȸ�������Է��� �ޱ����Ѱ�
		System.out.println("�̸�?");
		String name=sc.next();
		System.out.println("��ȭ��ȣ?");
		String tel=sc.next();
	
	//���������Է�
		vo.setName(name);
		vo.setTel(tel);
		
	//���»���
	//���¹�ȣ 1��1����/��ȭ��ȣ=���¹�ȣ/�ܾ�=0
		vo.setAccount(tel);
		vo.setMoney(0);
	//����
		user.append(vo);
	}
	
	public void viewAccount(String account) {
	//	user.getList();//������ ���� ��ȯ��
		UserVO[] list =user.getList(); //������ ������ ������ִ°�(������(�迭)�������°�)
		int count =user.getCount();
		for(int i=0;i<count;i++) {//�迭�� 0���� �����̴ϱ�
			UserVO v=list[i];
			String vac=v.getAccount();
		//	if(v.getAccount().equals(account)) {
			if(v.getAccount().equals(account)) {//���¹�ȣ ��ȯ�� 	//��Ʈ������ �����Ѱ� �������ڴ� //�ԷµȰ͸� ����
		//���¹�ȣ�� ��ġ�ϸ� 
				System.out.println(v);
		
			}
	}
	
	}
}
