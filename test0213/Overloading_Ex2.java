package test0213;

public class Overloading_Ex2 {
	public static void main(String[] args) {
		Test2 ob=new Test2();
	
		int a=10;
		short b=10;
		int c=10;
		Integer d=10;  //int�� Ŭ������ �����.
		long e=10;
		Long f=10L;  //  Long f=10; => ����

	//ȣ��
		ob.write();	//���ھ��� ��.
		ob.write(a);  //short  //a�� ����
		ob.write(b);  //short  //b�� ����
		ob.write(c);  //int  //c�� ����
		ob.write(d);  //int : �Ű������� Integer�� ������ int�� Integer�� int�� �Ѱܹ��� �� �ִ�.
		ob.write(a,b);  //int,int �� short,short �� �������ִ�.(�޴°� �ڷ���(int>short)�� �� Ŀ�� ����)
		ob.write(e);    //Long //�켱������ �ڱⲨ�� �� ũ��. 
		ob.write(f);	//Long
		
		//�޼ҵ� ã�� ����
		//	�޼ҵ��,�Ķ���ͷ� �޼ҵ带 ����
		// 1> �Ű������� ������ �ڷ����� ���� �˻�
		// 2> �⺻���� ������ �ڷ����� ������. �⺻�� �� ���� ����� ū �⺻���� ã�´�.
		// 3> �⺻���� ������ �ڷ����� ����,�⺻�� �� ū �ڷ����� ���� ���. ���� ũ���� Wrapper Ŭ������ ã�´�.
		
		
		
		short s=10;
		ob.print(s); //int

	}
}

class Test2{
	public void write() {
		System.out.println("���ھ��� �޼ҵ�");
		
	}
/*
	//������ ����,�޼ҵ� �����ε��� �Ű������� �����Ѵ�.
	public int write() {
		return 0;
	}
*/
	
	 public void write(short a) {
		 System.out.println("short..."+a);
	 }
	 
	 public void write(int a) {
		 System.out.println("int..."+a);
	 }
	 
	 public void write(int a,int b) {
		 System.out.println("int 2��..."+a+","+b);
	 }
	 
	 // short�� Ŭ������ ����� : Short
	 public void write(Short a) {
		 System.out.println("Short..."+a);
	 }
/*	//������ ȣ���� long�� ��� Ŭ���� Long���� ���µ� double�ڷ����� ��ũ�ϱ� double�� ������ ����� �´�. 
	 public void write(double a) {
		 System.out.println("double.."+a);
	 }
*/
	 // long�� Ŭ������ ����� : Long
	 public void write(Long a) {
		 System.out.println("Long..."+a);
	 }
	 
	 public void print(Short a) {
		 System.out.println("Short...pppp"+a);
	 }
	 
	 public void print(int b) {
		 System.out.println("int...ssss");
	 }
}
