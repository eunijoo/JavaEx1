package test0203;

public class SwitchEx1 {

	public static void main(String[] args) {
		
		int a=3;
		
		switch (a) {  //����,�����
		case 3:System.out.print("*"); //a=3�̳�? //3�� ������ �Ʒ����� ���
		case 2:System.out.print("#"); 
		case 1:System.out.println("$");
		}
		
		int b=2;
	
		switch (b) {
		case 3:System.out.print("*"); //b=2���� 3�� ����ϰ� 2���� ��µ�.
		case 2:System.out.print("#"); 
		case 1:System.out.print("$");
		}

	}
}