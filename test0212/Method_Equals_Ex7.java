package test0212;

public class Method_Equals_Ex7 {  //main�� ���� class �ȿ� ����
	public static void main(String[] args) {
	
		String s1="����"; //s1�� s2�� ���� ���̿��� ������ �ϳ��� �������.
		String s2="����"; // �Ȱ����Ÿ� ������ �ȸ���
		String s3=new String("����");  //new�� ������ �޸𸮰����� ���� ����
		
		System.out.println(s1+":"+s2+":"+s3); //���� : ���� : ����
		
		// (==) : ��ü�� �ּҸ� ��
		System.out.println(s1==s2); //true //���ڿ��� �ּҺ�
		System.out.println(s1==s3); //false //���ڿ��� �ּҺ�
		System.out.println(s1.equals(s3)); //true //equals : ���ڿ��� ���� ���϶�°�
	}
}
//���ڿ��� ��ü -> �������� �޸��Ҵ�.
//������ �������� ���ڿ��� �ּҰ� ����Ǵµ� ���ڿ��� ���ڿ�(��)�� �����ϰ� �Ҽ�����.

	
	

