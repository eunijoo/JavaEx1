 package test0219;

public class OverridingEx9 {
	public static void main(String[] args) {
		
		
		
		Demo9 dd1=new Demo9(); //��¥ ����ü //����޸��Ҵ�
		System.out.println(dd1);//Demo9@�ؽ��ڵ� 
//Demo9:�ƹ��� Test9:�ڽ�  
		Demo9 dd2=new Test9(); //��ĳ���� :������ ����  //����,�׽�Ʈ �޸��Ҵ� //��¥ new�Ѱ� Test 
		System.out.println(dd2);//Test9@�ؽ��ڵ�
		
		System.out.println(dd2.b); //Demo9�� �ʵ� ���
		dd2.print();//�������̵� �� ����Ŭ�����޼ҵ� ȣ��, �ܺο����� �ƹ����� ���ü�����.
					//�����Ҷ� ������:�������ε� : ������
					//�޼ҵ�� �ʵ�� �ٸ���.
		
		//dd2.sub();//ȣ��Ұ� //�����Ϸ��� Demo9�� ����.
		//int x= dd2.c; //�����Ͽ���
		
		// int x=(Test9)dd2.b; //������ �ٲ�󿩼� ����
		int x=((Test9)dd2).b; 
		System.out.println(x);
		// Test9 tt=(Test9)dd1; //�ٿ�ĳ����.��Ÿ�ӿ���  (dd1�� ��ĳ�����Ѱ� �ƴϿ��� ����)
								//�ٿ�ĳ������ �� ĳ������ �͸� �����ϰ�, �ݵ�� ĳ�����ؾ���.
								//�ƹ����� �ڽ� �������� ĳ����������Ѵ�.
		
		Test9 tt=(Test9)dd2;//�ٿ�ĳ���� (dd2�� ���Ѱſ��� ����)
		System.out.println(tt.b);
		
/*
	- ��ü���� ĳ������ ���ϰ���(�ڽ�,�θ����)������ �����ϴ�.
	- ��ĳ������ ������ �����ϴ�. 
	- �ٿ�ĳ������ ��ĳ������ �͸� �����ϰ�, �ݵ�� ĳ������ �ʿ��ϴ�.
		 
*/
	//instanceof:�ش�Ǵ� ��ü Ȯ��
		System.out.println(dd1 instanceof Test9);	//false  //�� Ŭ������ ��ü�̴�? Ȯ�� 
		System.out.println(dd2 instanceof Test9);	//ture
	
		if(dd2 instanceof Test9) {  //�ش�Ŭ���� ��ü�̸�
			Test9 tt2=(Test9)dd2;
			tt2.sub();
		}
	}
}

class Demo9{
	int a=10;
	int b=20;
	
	public void print() {		// 1>
		System.out.println(a+":"+b);
	}
}

class Test9 extends Demo9{
	int b=200;
	int c=300;
	
	public void print() {		// 2>
		System.out.println(a+":"+b+":"+c);	//10:200:300
	}
	
	public void sub() {
		System.out.println(a+":"+super.b+":"+c); //10:20:300
		super.print(); 	//1 >ȣ��
		//print(); 		// 2>ȣ��
	
	}
}