package test0130;

public class OperEx9 {

	public static void main(String[] args) {
		int a=13, b=20;
		int c;
		
		System.out.println(a%2==1); //true. Ȧ��
		System.out.println(b%2==0); //true. ¦��

		c=a&1;
		System.out.println(c); //1 (Ȧ��)
		//System.out.println(a&1==1); //���� (��Ʈ���� ����켱���� == -> (>,<,&,|,)
		System.out.println((a&1)==1); //true.Ȧ��
	
		c=b&1;
		System.out.println(c); //0 (¦��)
		System.out.println((b&1)==0); //true.¦��
			
	}

}
