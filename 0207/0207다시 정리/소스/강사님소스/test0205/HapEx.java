package test0205;

import java.util.Scanner;

public class HapEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num, s, ch;
		int start, offset;
		String title;

		while(true) {
			do {
				System.out.print("1.�� 2.Ȧ���� 3.¦���� 4.���� =>");
				ch=sc.nextInt();
			}while(ch<1||ch>4);
			
			if(ch==4) break;
			
			System.out.print("���ϴ¼�?");
			num=sc.nextInt();
			
			switch(ch) {
			case 1: start=1; offset=1; title="�� : "; break;
			case 2: start=1; offset=2; title="¦���� : "; break;
			default: start=2; offset=2; title="Ȧ���� : "; break;
			}
			
			s=0;
			for(int i=start; i<=num; i+=offset) {
				s+=i;
			}
			System.out.println("1~"+num+"������ "+title+s+"\n");
		}
		
		sc.close();
	}
}
