package test0219;

public class InheritanceEx2 {

	public static void main(String[] args) {
		Test2 tt=new Test2(); //��ü����
		tt.print();
		
		System.out.println(tt.a+":"+tt.b+":"+tt.c+":"+tt.d);//10:20:200:300
		//	System.out.println(tt.super.c);//�Ŀ���.�ش� Ŭ���� �ܺο��� super ���Ұ���.
		
		System.out.println(((Demo2)tt).c); //30 (�ƹ�����)
	}

}
//this/super : Ŭ������������ ��밡��(�ܺο��� ��� �Ұ���)
//this :��ü �ڱ� �ڽ��� ��Ÿ���°�(���������� ���ϸ����� ��������� this�� �Ⱦ��� ���������� ��µ�)
//�ٸ� �����ڸ� �θ��� this�� ����.
//�����ڴ� new �������� �ü��ִ�. 
//super: �ƹ�����  //���� �ƹ��� �Ѵ� �ִ°ǵ� �ƹ����� ��������� ���


class Demo2{	//�ƹ���Ŭ����
	int a=10;
	int b=20;
	int c=30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test2 extends Demo2{ //�ڽ�Ŭ����
	int c=200;
	int d=300;
	
	/*	//�����ڸ� ���� �ȸ�����༭ �����Ϸ��� �˾Ƽ� ������ش�. ������ �������ִ�.
	public Test2() { //����Ʈ������ ����: { }�ӿ� ���뵵����,( )�ӿ� ���ڵ�����
		super(); //����Ʈ�����ڿ� �ش系���� �������ִ�.
	}
	 */
	
	public void print() { //���������� ���� ������������  this�� �Ƚ��ָ� ���������� ��µ�.
		int a=1;
		System.out.println(a+":"+b+":"+c+":"+d);	//10(�̹�����) : 20(�ƹ�����) : 200(�ڽĲ�):300(�ڽĲ�)
		System.out.println(this.a+":"+this.b+":"+this.c+":"+this.d);  //�ƹ������� �����ϱ� �����״�γ���
		System.out.println(super.a+":"+super.b+":"+super.c+":"+this.c); //super: �ƹ����� ������
	}
}