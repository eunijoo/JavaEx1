package test0204;

import java.util.Scanner;

public class While_If_gugudan2 {
//���� �Է¹޾� ������ ���,��, �Է¹��� ���� 1-9 �� ����� ���Է�.
	public static void main(String[] args) {
		
		int dan=0,n;
		boolean b;
		Scanner sc=new Scanner(System.in);
		
		//boolean, if���� ����,���� �ʱ�ȭ�� ��������ؼ� �� ��ȿ����
		// do~while������ �ۼ��ϴ� ���� �� ȿ�����̴�.	
		b=true;
		while(b) {  //�Է¹��� ���� 1-9 �� ����� ���Է��ϴ� ����
			System.out.println("��?");
			dan=sc.nextInt();	
			if(dan>=1 && dan <=9) //1-9���� �Է����� ��� ������ ��������.
				b=false;	    //����� �Է����� ��� false�� ó���ؼ� ��������.
		}
	
		n=0;
		while(n<9) {  //������ ��±���
			n++;
			System.out.printf("%d*%d=%d\n",dan,n,dan*n);
		}
		
		sc.close();
	
	}
}

