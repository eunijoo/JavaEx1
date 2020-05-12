package test0214;

public class Equals_String_Ex1 {
	public static void main(String[] args) {
		Test1 t1=new Test1(); //��ü ����
		Test1 t2=new Test1(); //��ü����
		Test1 t3=t2; //���ϳ��� 2��
		
		boolean b;
		b=t1.equals(t2); //t2�� t3 �ּҺ� 
		System.out.println(b);  //false
		System.out.println(t1==t2);  //false // == : ��ü�� �ּҺ�
		System.out.println(t2==t3);  //true 
		
		b= t2.equals(t3);
		System.out.println(b); //true // t2�� t3�ּҺ�
		
		String s;
		s=t1.toString(); //Ŭ���� ���� : ��Ű����.Ŭ�����̸�@�ؽ��ڵ�(16����)
		System.out.println(s);
		
		System.out.println(t2); //��ü���� ����ϸ� toString()�� ���� ���
		System.out.println(t2.toString()); //toString �� ���� �ʾƵ� ���� ����� ���´�.��, ����Ҷ���.
		System.out.println(t3);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());//t3�� ������ü���� ���� ���
		System.out.println(t3.hashCode());//t2�� ������ü���� ���� ���
		
		
	}

}

class Test1{
	private int a=10;
	
	public void print() {
		System.out.println(a);
	}
}
