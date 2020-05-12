package test0214;

public class Api_String_Ex5 {
	public static void main(String[] args) {
		String s="  ��    ��   ";
		System.out.println(":"+s+":");
		System.out.println(":"+s.trim()+":");
		System.out.println(":"+s.replaceAll(" "," ")+":");
		
		int a=1234567;
		s=String.format("%,d", a);
		System.out.println("format : "+s);
		
		s=String.format("%1s,d %1$d %2$d", a,20); //a:1$ 20:2$
		System.out.println("format : "+s);
		
		s="KOREA";
		byte[] bb=s.getBytes();  //���ڿ��� ASCII�ڵ尪��  byte�迭�� ��ȯ
		for(byte b:bb) {
			System.out.println("getBytes : "+ b);
		}
		
		//bytes�� �迭��
		String s1=new String(bb);
		System.out.println("s1 : "+ s1);
		
		System.out.println("���ѹα�...");
		bb="���ѹα�".getBytes();
		for(byte b :bb) {
			System.out.println("b:"+ b);
		}
		
		String s2;
		//s2= 123; //123�������� s2�� ���ڿ��̶� �Ŀ���
		//s2= ""+123; //���ڿ��� �ٲ��༭ ���������� ������!!
		
		//������ ���ڿ��� ����
		s2=Integer.toString(123); 
		System.out.println("Integer.toString����->���ڿ� : "+s2);
		
		//���ڿ��� ������ ����
		s2="100";
		int n= Integer.parseInt(s2);
		System.out.println("Integer.parseInt���ڿ�->����: "+n);
		
		
		
	}
}
