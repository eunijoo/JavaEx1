package test0213;

public class Constructor_Ex6 {
	public static void main(String[] args) {
		Test6 ob=new Test6();
		ob.write();
		
	}
}

class Test6{
	private int n;
	
/*
 -- ������ :  - new�� �̿��Ͽ� ��ü�� �����Ҷ� ȣ��.
 			- �ʱ�ȭ
 */
	
	//public void Test6() { //�żҵ�
	public Test6() {  //������  //��ü�� �θ������� ����.
		n=10;
		System.out.println("���ھ��� ������");
	}
	
	
	public void write() {
		System.out.println(n);
	}
}
	
	
//1>new -> 2> Tset6���ο� -> 3> 10��

