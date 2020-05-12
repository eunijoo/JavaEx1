package test0214;

public class StringBuilder_Ex12 {
	public static void stringBufferTime() {
		long start=System.currentTimeMillis();
//��Ʈ�� ���� Ŭ����	
		StringBuffer sb=new StringBuffer("a");
		for(int i=1; i<100000;i++) {
			sb.append("a");
		}
		
		long end=System.currentTimeMillis(); //�ð��� ���ϴ°�
		
		System.out.println("StringBuffer Ŭ����...");
		System.out.println("���ڿ�����"+sb.length());
		System.out.println("����ð�:"+(end-start)+"ms");
				
	}
//��Ʈ�� ���� Ŭ����
	public static void stringBuilderTime() {
		long start=System.currentTimeMillis();
		
		StringBuilder bu=new StringBuilder("a");
		for(int i=1; i<100000;i++) {
			bu.append("a");
		}
		
		long end=System.currentTimeMillis(); //�ð��� ���ϴ°�
		
		System.out.println("StringBuilder Ŭ����...");
		System.out.println("���ڿ�����"+bu.length());
		System.out.println("����ð�:"+(end-start)+"ms");
		
	}
//��Ʈ�� Ŭ����
	public static void stringTime() {
		long start=System.currentTimeMillis(); //�ð��� ���ϴ°�
		String s="a";
		for(int i=1; i<100000;i++) {
			s+="a";
		}
		long end=System.currentTimeMillis(); //�ð��� ���ϴ°�
		
		System.out.println("String Ŭ����...");
		System.out.println("���ڿ�����"+s.length());
		System.out.println("����ð�:"+(end-start)+"ms");
				
		
	}
	
	public static void main(String[] ss) {
		stringBufferTime();
		System.out.println("------------------------");
		stringBuilderTime();
		System.out.println("------------------------");
		stringTime();
	}
}
