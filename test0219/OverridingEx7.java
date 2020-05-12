 package test0219;

public class OverridingEx7 {
	public static void main(String[] args) {
		
		Demo7 dd1=new Demo7();
		Demo7 dd2=new Demo7();
		System.out.println(dd1.equals(dd2)); //�ּҺ� .false
											//Object�� equals()ȣ��
		System.out.println(dd1);
		System.out.println(dd1.toString());  //Ŭ�����̸�@�ؽ��ڵ�
		
		Test7 tt1=new Test7();
		Test7 tt2=new Test7();
		System.out.println(tt1.equals(tt2)); //�ּҺ�. true // 1>
							//Test7�� �����ǵ� equals()ȣ��
		
		System.out.println(tt1);	//100
		System.out.println(tt1.toString());	//100
//������ ����ã�� �������������� �ƹ������� ã�´�. �ƹ������׵� ������ ����.
	}
}
class Demo7{
	int a=10;
	public void print() {
		System.out.println(a);
	}
}
class Test7{
	int a=100;
	public void print() {
		System.out.println(a);
	}

//equals ������ //�ƹ����� equals�� ��� ������������𸣸� ������ �Ұ�
	@Override 
	public boolean equals(Object obj) {  //obj�� tt2����
		Test7 t = (Test7)obj;	//obj�� 1>�� tt2
		return this.a==t.a;		//this�� 1>�� tt1
	//	return a==t.a; //���� ������
	}

//toString ������ //���� ��µ�
	@Override
	public String toString() {
		return "a:"+a;
	}	
	
}

