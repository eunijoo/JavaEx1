package test0217;

import java.util.Calendar;
import java.util.Scanner;
//�޷�¥��
public class Calendar_Class_Ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y,m,w,ends;
		
		do {
			System.out.print("�⵵?");
			y=sc.nextInt();
		} while(y<1900);
		
		do {
			System.out.print("��?");
			m=sc.nextInt();
		} while(m <1 || m>12);
		
		Calendar cal=Calendar.getInstance();
		cal.set(y,m-1,1);  //���� 1�� �����Ѵ�.  //1�� �Է�
		w=cal.get(Calendar.DAY_OF_WEEK);
		ends=cal.getActualMaximum(Calendar.DATE); //��������¥���� ����
		
		System.out.println("     \t"+y+"�� "+m+"��");
		System.out.println("     ��    ��     ȭ     ��     ��     ��     ��");
		System.out.println("============================");
	
	//������
		for(int i=1;i<w;i++) {
			
			System.out.print("    ");  
		}
	//��¥���	
		for(int i=1;i<=ends;i++) {
			System.out.printf("%4d",i);
			w++;
			if(w%7==1) {   //��¥ �� ������� ����
				System.out.println();
			}
		}
		
		if(w%7!=1) { 
			System.out.println();
		}
		System.out.println("============================");
		
		sc.close();
	}

}
