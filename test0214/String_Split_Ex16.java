package test0214;

public class String_Split_Ex16{
	public static void main(String[] args) {
	//���ڵ���:MS949
		System.out.println("����Ʈĳ���ͼ� : "+System.getProperty("file.encoding")); //MS949
		
		try {
			byte[] b;
			String s="���ѹα�";
			
		//MS949
			b=s.getBytes(); //MS949 �ڵ尪�� ������
			System.out.println("MS949 ����: "+b.length+"byte");
			for(byte a:b) {
				System.out.println(a+" ");
			}
			System.out.println();
			System.out.println("=======================");
	
		//UTF-8�� �ٲٲ�����
			b=s.getBytes("utf-8"); // UTF-8
			System.out.println("utf-8 ����: "+b.length+"byte");
			for(byte a:b) {
				System.out.println(a+" ");
			}
			System.out.println();
			System.out.println("=======================");
		}catch (Exception e) {			
		}
	}
}
