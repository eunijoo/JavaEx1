package test0217;

import java.util.Random;
import java.util.Scanner;

/*
 	-������
 	1~100���� �� �� �ϳ��� ������ �����Ͽ� 20�� �ȿ� ���ߴ� ����	
 ex>
 	input ? 20
 	20���ٴ� Ů�ϴ�.
 	
 	input ? 40
 	40���ٴ� �۽��ϴ�.
 	
 	input ? 37
 	3���� �����߽��ϴ�.
 */
public class Random_Class_EX18 {
	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		
/* for������ �ۼ�	
		int s,n;
		int cnt=0;
		
		n=rnd.nextInt(100)+1;	//1~100���� �����߻�
		for(int i=1; i<=20 ;i++) {
			System.out.println("input ? :" );
			s=sc.nextInt();
			cnt++;
			
			 if(n<s) { 
				System.out.println(s+"���� �۽��ϴ�");
			 }else if(n>s) {
				 System.out.println(s+"���� Ů�ϴ�.");
			 }else if(n==s) {
					System.out.println(cnt+"���� �����߽��ϴ�."); break;
			 }
				
			}
			if(cnt>20) {
				System.out.println("�Է�Ƚ���� �ʰ��Ͽ����ϴ�.");

			}	
*/
	//do-while������ ¥�� �� ª�� ȿ�������� ©���ִ�.
		int input;
		int cnt=0;
		
		int com = rnd.nextInt(100)+1;
		do {
			System.out.println("input?");
			input=sc.nextInt();
			
			if(com>input) {
				System.out.println(input+"���� ũ��");
			}else if(com<input) {
				System.out.println(input+"���� �۴�");
			}
			cnt++;
		}while(input != com && cnt <20);
		
		if(input==com) {
			System.out.println(cnt+"���� ����...");
		}else{
			System.out.println("����");
		}			
			sc.close();
		}	
	}
