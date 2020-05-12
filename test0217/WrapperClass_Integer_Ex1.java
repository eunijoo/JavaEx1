package test0217;

public class WrapperClass_Integer_Ex1 {

	public static void main(String[] args) {
		int a=10,b;
		Integer ob;
		String s,s1,s2;
		double d;
/*
 	- ��ü�� �⺻ �ڷ����� �⺻������ ����ȯ�� �Ұ����ϴ�.
 	- ���ϰ��谡 �ƴ� ��� ��ü������ ����ȯ�� �Ұ����ϴ�.
 	- Integer�� null�� ���� �� �ְ�, �⺻�ڷ����� null�� ������ ����.
 */
		
		ob=a;  //ob�� Integer(��ü) /a�� int(�⺻�ڷ���) 
			//�⺻�ڷ����� int�� Integer�� �ڵ���ȯ 
			//�����δ� ob = new Integer(a); => �������Ҷ� ��ȯ
			//Autoboxing : �⺻�ڷ������� ��ü�� �ڵ���ȯ�Ǵ� ���� �ǹ�.
		
		b=ob;	//Integer ��ü�� �⺻ �ڷ���(int)�� �ڵ���ȯ
				// �����δ� b= ob.intValue(); => �������Ҷ�
				// Auto-unboxing : ��ü���� �⺻�ڷ������� �ڵ���ȯ�Ǵ� ���� �ǹ�.
		
		System.out.println(a+":"+ob+":"+b);
		
		s1="123";
		s2="456";
		//a=s1+s2; //������ ����. s1,s2�� ���ڿ��̰�, a�� �������̿��� �ȵ�
		
		a=Integer.parseInt(s1)+ Integer.parseInt(s2); //parseInt : ���ڿ��� ���������� ��ȯ
		System.out.println(a);
		
	//	a=Integer.parseInt("123.5");  //��Ÿ�ӿ���
						//Number FormatException //������ ��ȭ�Ҽ� ���� ���ڸ� ���������� ��ȯ�Ϸ��Ҷ�
		
	//	a=Integer.parseInt("1,2345");  //��Ÿ�ӿ���
						//Number FormatException //������ ��ȭ�Ҽ� ���� ���ڸ� ���������� ��ȯ�Ϸ��Ҷ�
		
		a=10;
		s='A'+a+"korea"; //�ƽ�Ű�ڵ尪 65 +10
		
		s='A'+Integer.toString(a)+"korea"; //A�� ���ڿ��� ����
		System.out.println(s);

		a=Integer.parseInt("101");
		System.out.println(a); //101
		
		a=Integer.parseInt("101",2);  //2����
		System.out.println(a); //5
		
		
	//	a=Integer.parseInt("A1");  //��Ÿ�ӿ���
		a=Integer.parseInt("A1",16);  //16�������� A��� ���ڿ��� �־ �����ϴ�.
		System.out.println(a);  //161
		
		a=123;
		s=Integer.toBinaryString(a); //2������ ��ġ�°�
		System.out.println(s); //1111011
		
		s=Integer.toHexString(a);
		System.out.println(s);  //7b
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES); // 4byte
		System.out.println(Integer.TYPE); //int
		System.out.println(Integer.SIZE); // 32bit
		
		s="123.45";
		d=Double.parseDouble(s2);
		System.out.println(d);
		
		s=Double.toString(d); //���ڿ��� �Ǽ��� ��ġ�� ���
		System.out.println(s);  
		
	}

}
