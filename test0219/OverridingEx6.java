package test0219;

public class OverridingEx6 {
	public static void main(String[] args) {
		Test6 ob=new Test6();
		ob.print();
	}
}
//�������Ϸ��� ���ϰ��谡 ���־����.
class Demo6{
	int a=10;
	public void print() { // 1>
		System.out.println(a);
	}
}

class Test6 extends Demo6{
	int x=100;
	@Override //@Override ������̼� : ���� overrding �߾�� ��� �˷��ִ°� 
	public void print() {  // 2>
	//	System.out.println(int x); //overloding�̿��� ����(@Override�� �˻���)
		System.out.println(a+":"+x);
	}
	
	public void fun() {
		print(); // 2> ȣ��
		super.print(); // 1> ȣ��  //�ƹ������θ��°Ŵϱ� super
	}
}

