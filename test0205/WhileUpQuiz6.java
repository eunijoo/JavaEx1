package test0205;
//1~100������ ������ �߻����� ����� ���ߴ��� ����ϴ�  ���α׷�.
//1~100���� ���� �߻��ϴ� ���  int com=(int)(Math.random()*100+1);
import java.util.Scanner;

public class WhileUpQuiz6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int com,user,cnt; //com:��ǻ�ͺ���,user:�Է��ϴ»�� ����,cnt : �Է��� ��� �޾Ҵ��� ���� ����
		
		com=(int)(Math.random()*100+1);
		
		cnt=0;
		while(true) {
			System.out.println("��?");
			user=sc.nextInt();
			cnt++; //�Է��� ��� �޾Ҵ��� ���� ����,
			
			if(com>user) {
				System.out.println("�Է��� ������ �� Ů�ϴ�.");
			}else if(com<user) {
				System.out.println("�Է��� ������ �� �������ϴ�.");
			}else {
				System.out.println(cnt+"���� �����߽��ϴ�.");
				break;
			}
		}
		sc.close();
	}

}
