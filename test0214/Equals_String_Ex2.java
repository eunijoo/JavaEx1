package test0214;

public class Equals_String_Ex2 {
	public static void main(String[] args) {
		//���ڿ��� ���ڿ���������� ����(������)  //���ڿ��� ��ü��
		String s1="seoul";
		String s2="seoul";
		//1> ���ڿ� �����ϰ�, ����� �ּҸ� s1�� ����
		//2> ������ ���ڿ��� s2�� ������ ��� s1�� "seoul" ����� "seoul"�� �ּҰ� s2�� ����
		//   (������ ���ڿ��̸� ���̻� �ڹٰ� �޸𸮸� �Ҵ������� ����)
		String s3=new String("seoul");
		// new �� ���ο� �޸� �Ҵ�.
		
		System.out.println(s1==s2); //�ּҺ�.true
		System.out.println(s2==s3); //�ּҺ�.false
		
		// String�� equals()�� ���ڿ��� ���Ѵ�.
		System.out.println(s1.equals(s2));//����.true
		System.out.println(s1.equals(s3)); //����.true
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		//������ ��ü�� �ؽ��ڵ尡 ���������� �ؽ��ڵ尡 ���ٰ� ������ ��ü�� �ƴϴ�.(���ڿ��̿��� ���� �ؽ��ڵ尡 ����)
		System.out.println("s1:"+s1.hashCode());
		System.out.println("s2:"+s2.hashCode());
		System.out.println("s3:"+s3.hashCode());
		
	}
}
