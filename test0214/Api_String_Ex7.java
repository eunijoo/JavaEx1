package test0214;
/*
 1~100���� ���� ���ٿ� 10���� ����ϵ�, 
 �� �� 3,6,9�� �����ϴ� ��� ���ڴ��
 3,6,9 ���ڸ�ŭ   * ���

=> 3,6,9 ����
*/
public class Api_String_Ex7 {
	public static void main(String[] args) {
		
		String s;
	//3,6,9�� *�� �ٲ�	
		for(int i=1; i<=100;i++) {
			s=Integer.toString(i);
			s=s.replaceAll("3|6|9", "*");
		
	//0���� ã�Ƽ�, ���ڸ� ������
			if(s.indexOf("*")>=0) {	
				s=s.replaceAll("\\d","");							
			}
	//���	
			System.out.printf("%5s",s);
			
	//10������ ����
			if(i%10==0) { 
				System.out.println();
			}
		}
		
	}
}
