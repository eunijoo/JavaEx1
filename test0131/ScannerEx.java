package test0131;
import java.util.Scanner;

		public class ScannerEx {

			public static void main(String[] args) {
				// �� ���� �Է¹޾� ���������� ū�� ������ ���
				Scanner sc=new Scanner(System.in);  //Scanner �Ǽ�,������ �޴°ǵǴµ� ���ڹ޴°� �ȵ�.
				
				System.out.println("���ڿ�");
				String s=sc.next(); 
				
				char ch;
				
				ch=sc.next().charAt(0); //charAt(0)�� ���ڿ� �� ���� 1���� ù��°���ڸ� �Է¹���
				System.out.println("�� ����?");
				//s�� "korea"�� ���
				ch=s.charAt(0); //���� ó���� �ִ� ����
				System.out.println(ch); //k
								
				ch=s.charAt(2); //����°�ִ� ����
				System.out.println(ch);//r

				sc.close();
	}

}
