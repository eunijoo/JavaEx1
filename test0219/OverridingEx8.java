 package test0219;

public class OverridingEx8 {
	public static void main(String[] args) {
		Test8 tt= new Test8();//Demo8�� �ڽĶ����� �޸� �Ҵ��̵�(���� new���� �ʾ���)
		Demo8 dd=tt;  // ��¥ dd�� Test8 (new�Ѱ� Test8���� Demo8�� �ƴϿ���)
		//����Ŭ���� ��ü�� ����Ŭ���� ��ü�� ����Ŵ
		//�� ĳ����(up casting) : ������ ����
		
		System.out.println(tt.b+":"+tt.c);  //200 : 300
	
		System.out.println(dd.b); // 20
		dd.print();  //10 : 200 : 300
		//����Ŭ������ �޼ҵ带 ����Ŭ�������� �������ϸ� ����Ŭ������ �޼ҵ�� ���´�.
		//���� ����Ŭ������ ��ü�� ����Ŭ������ ��ü�� ����Ű�������Ƿ� 
		//�޼ҵ忡���� �������̵��� �� ����Ŭ������ �޼ҵ尡 ȣ��ȴ�.
		//��, �ܺο����� �޼ҵ尡 �������̵��� �� ���. ����Ŭ������ �޼ҵ�� �θ� �� ����.
		//����Ŭ�����ȿ����� superŰ����� ȣ�Ⱑ���ϴ�.
		
	  // System.out.println(dd.c); //�����Ͽ��� // 
	//�������ε� :
	//�������ε� :
	}
}
class Demo8{  //�ƹ���
	int a=10;
	int b=20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}

class Test8 extends Demo8{
	int b=200;
	int c=300;
	
	public void print() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void sub() {
		super.print();//�����޼ҵ� ȣ�Ⱑ��.
		System.out.println(b+":"+c);
	}
}