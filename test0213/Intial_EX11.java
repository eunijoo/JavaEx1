package test0213;

public class Intial_EX11 {
	public static void main(String[] args) {
		Test11 ob=new Test11();//��ü ����
/*		 
    	new�� �Ҷ����� 1,2,3,4,5 ������ ����
		 1> new -> ��ü ���� :�ν��Ͻ����� a,b �޸� �Ҵ�
		 2> a <- 0 ,b <- 0�� ����Ʈ������ �ʱ�ȭ
		 3> �ʱ�ȭ �� ���� : b <- 20
		 4> �ʱ�ȭ���� ����
		 5> ������ ��ü ����Ǿ� �ʱ�ȭ �۾�.
 */
		ob.write();
		
		//���� 1~5���� �ٽ� ����
		Test11 ob2=new Test11();//��ü ����
		ob2.write();
	}
}

class Test11{
	private int a;
	private int b=20;
	//a=10; //�Ŀ���.���๮ �ü� ����
	{
		//�ʱ�ȭ ��(�����ڿ����� ����)
		a=10;
		System.out.println("�ʱ�ȭ ��,,,");
	}
	
	public Test11() {  //������ 
		System.out.println("������...");
		
	}
	
	public void write() {
		System.out.println(a+":"+b);
	}
}
