package test0211;

public class Class_Ex1 {  //class ���� public�� ����� Ŭ������տ� �ѹ��� �����ִ�.
					//�ܺ������� ������ class

	public static void main(String[] args) {
	
	//(3)��ü����(�޸��Ҵ�) <ex>�ؾ �ֹ� �� ����. //Ŭ������ �����ϸ� ������ �ƹ����� ����.
		//������������(���۷�������)
		Rect oo;  //Ŭ������ + ������
		
		//�޸� �Ҵ� : ������ = new Ŭ������();  <ex>�ؾ�������θ�
		oo= new Rect(); //������(�޸��Ҵ� �ۿ� ����)�� �ҷ��� �޸��Ҵ��Ҽ��ִ�. 
						//�����ڸ� �ȸ���� �������Ҷ� �ڹٰ� �ڵ����� ����Ʈ�����ڸ� �����.
		
		//Ŭ������ �ʵ�,�޼ҵ忡 ���� <ex>�ؾ �ֹ�(��,��ũ�� ���氡��)
		oo.width=10;
		oo.heigth=5;
		
		int a,b;
		
		a=oo.area();
		b=oo.len();
		
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+b);
	}

}
/*
	-�簢�� ����,�ѷ� ���ض�.
	 - (1)�߻�ȭ <ex> �ؾ��������� ���,�����غ�,�ؾ����� ����
	 	- �ʵ�(�Ӽ�,������) :����,����
	 	- �޼ҵ�(����) :���̰��.�ѷ����
*/
//(2)Ŭ��������(�߻�ȭ �� ���� �ڹپ��� �ٲ�)
class Rect{ // <ex>�ؾƲ
	//�ʵ�(�ν��Ͻ� ����) 
	
	//private int width; //private : �ش� Ŭ����(class Rect)������ ��밡��(�ܺ���������)//�ڽĵ� �������ѵ�
	int width;
	int heigth;
	
	//�ϳ��� �޼ҵ忣 �ϳ��� ��ɸ� �����.
	
	//���� �޼ҵ�
	public int area() {
		int result;
		result=width*heigth;
		return result;
	}
	//�ѷ� �޼ҵ�
	public int len() {
		int result;
		result=(width+heigth)*2;
		return result;
	}
	
}