package test0217;

public class WrapperClass_Integer_Long_Ex2 {

	public static void main(String[] args) {
	
		//Long ob1=10; //�Ŀ��� 	//Ŭ���������� ����ȯ�� �ȵȴ�.
		//Long ob1=10L; // ����
		Long ob1=new Long(10); 
		Integer ob2=10;

	//	Long ob3;
		//ob3=ob2; //�Ŀ���.
				   //���ϰ��谡 �ƴ� ��� ��ü������ ����ȯ �Ұ�.
		//ob3= (Long)ob2; //�Ŀ���
		
		long a;
		a= ob2;  //ob2�� ��ü // a=ob2.intValue(); //�⺻�������� a�濡 ���� �� �ִ�.
		
	//	ob3 = new Long(ob2); //����
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(a);
		
	}

}
