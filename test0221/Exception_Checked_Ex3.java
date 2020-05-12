package test0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Checked Exception(üũ ����)
 * : �����Ϸ��� ���� üũ�Ǵ� ���� 
 * 
 * UnChecked Exception(��üũ ����)
 * : ��Ÿ�ӽ� �߻��Ǵ� ����
 *    
 */

public class Exception_Checked_Ex3 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader : �ѹ��� ������ �Է¹޴� ��
		// System.in: Ű����,	System.out: ����� ��� �����ϱ�
		
		String s;
		
		int a,b,c;
		
		 
		 try {
			System.out.println("ù��° ��? ");
			s= br.readLine();	// checked ���� : ����ó���� ���������� ����� �� ������ �ǹ� 
			//readLine()�� checked exception�� �߻��ϹǷ� �ݵ�� ����ó���� �ؾ��� : IOException
			a= Integer.parseInt(s);
			
			System.out.println("�ι�° ��? ");
			b = Integer.parseInt(br.readLine());
                			
			c= a / b;
	
			System.out.println(a+"/"+b+"="+c);
		 } catch (IOException e) {
			 //IOException :����¿� ���ڰ� �߻��Ҷ� �߻��ϴ� ����.
			 //	checked ���ܷ� �ݵ�� ����ó���� �ؾ��Ѵ�.
			 //	checked exception �� �޼ҵ带 ������ �� throw�� ����
			 //	����ó���� ���� ������ ������ ������ �߻��ϴ� ����
			e.printStackTrace();
		}	
		 System.out.println("end...");
	}
}
