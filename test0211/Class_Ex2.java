package test0211;

public class Class_Ex2 {  

	public static void main(String[] args) {
		
		Bank b1; //��������(���۷�������) ����
		//b1.name="ȫ�浿"; //�Ŀ��� =>�ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� ��ü�� �����Ǿ�� ���ٰ���
		
		//���������޸� �Ҵ�(�����ڸ� ȣ��)
		b1=new Bank();
		b1.name="ȫ�浿"; //����Ʈ���������ڴ� ������Ű���� Ŭ���������� ���ٰ���.
		//b1.money=1000; //�Ŀ��� => private�� �ܺο��� ���ٺҰ�
		b1.saving(1000);
		
		//�������� ����� ���ÿ� �޸� �Ҵ�
		Bank b2=new Bank();
		b2.name="�̼���";
		b2.saving(500);
		
		System.out.println(b1.name+ ": "+b1.getMoney());
		System.out.println(b2.name+ ": "+b2.getMoney());
	}
		
}

class Bank{
	//�ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� ��ü�� �����Ǿ�� ȣ�� �� ���ִ�.
	
	//�ν��Ͻ� ����. ���� ����� �ʱ�ȭ ����
	//private : Ŭ���� �������� ��� ������ ����.�ܺ����ٺҰ�
	private int money;
	//money 0;  //�Ŀ���. ���๮�� �ü�����.
	
	//�ν��Ͻ�����.
	//���������ڰ� ����Ʈ(�����Ѱ��) �� ��� ������ ��Ű�������� ���ٰ���
	String name;
	
	//�ν��Ͻ� �޼ҵ�
	public int getMoney() {
		return money;
	}
	
	//�ν��Ͻ��޼ҵ�
	public int draw(int m) {  // m : �Ű�����
		//����
		if(m>money)
			return 0;
		
		int s; // s: ��������(�޼ҵ� �ȿ��ִ� ������ ����������� ��)
		s=money-m;  //�ܰ��� ������
		money=s;
		
		return m;
	}
	
	//�ν��Ͻ� �޼ҵ�
	public void saving(int m) {
		//�Ա�
		money+=m; //���� ����
	}
}
	
