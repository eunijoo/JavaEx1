package test0212;

public class Method_Ex1 {
	public static void main(String[] args) {
		Test1 t=new Test1(); //������ �����������
		
		t.print(); //10
		t.add(); 
		t.print(); //11 //�ٷ������� add�� ���� a++����
		
		t.write(5); //5
	}
}

class Test1{
	int a=10; //�ν��Ͻ�����,�ʵ�� Ŭ�����ȿ����� �������� �����̴�.
	
	public void add() {
		a++;
	}
	public void print() {
	//	int a=5; //(o)���������� �̸��� ���Ƶ� �ȴ�.
	//	int a=6; //(x)������������ �̸��� �����ϸ�  �ȵȴ�.
		System.out.println(a);
	}
	public void write(int a) { //a=�Ű����� => ��������
		//int a; //(x)������������ �̸��� �����ϸ�  �ȵȴ�.
		// �ʵ�� ��������(�Ű�����)�� �������� �������ִ�.
		// �ʵ�� ���������� �̸��� �����ϸ� �켱������ ���������� ����.
		System.out.println(a);  //�Ű�����(��������) a
	}
}