package test0221;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_Checked_Ex5 {
	public static void main(String[] args) {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
		
		try {
			System.out.println("ù��°��?");
			a=Integer.parseInt(br.readLine());			
			System.out.println("�ι�°��?");
			b=Integer.parseInt(br.readLine());
			
			c=a/b;			
			System.out.println(a+"/"+b+"="+c);
			
		}catch (Exception e) {   //Ŭ���̾�Ʈ�� ������ ���� �𸥴�. �����ڸ� ���� �������� Ȯ�ΰ���. =>Exception_Checked_Ex4���� ����ó���Ѱ� �� ����.
			//Exception : ��� ���ܸ� �� catch ����.
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}