 package test0219;

public class OverridingEx10 {
	public static void main(String[] args) {
		
		Object ob1=new String("����"); //��ĳ����
		Object ob2=new String("����"); //��ĳ����
	//ob1�� ���ڿ� ���̾˰����
		//System.out.println("����: "+ob1.length()); //�Ŀ��� => ��ĳ���õż� �ٽ� �ٿ�ĳ��������� ����
		System.out.println(((String)ob1).length());
		
		System.out.println(ob1.equals(ob2)); //����. �޼ҵ尡 �������̵��Ǿ�����(�ƹ����� ����)
		
		
		
		
	}
}

