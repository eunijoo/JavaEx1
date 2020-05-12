package test0217;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_Class_Daily_Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("��¥ [yyyy-mm-dd] ?");
		str=sc.next();
		sc.close();  //retrun������ ���� �����
		//������ ����ó�� �ؾ������� ���� ����ó���� ����� �ʾƼ�...
		if(str.length()!=10 || str.split("-").length!=3) {
			System.out.println("��¥ �Է� ���� ����");
			return;
		}
		
		String[] ss=str.split("-");
		int y=Integer.parseInt(ss[0]);
		int m=Integer.parseInt(ss[1]);
		int d=Integer.parseInt(ss[2]);
		int w,n; //w:���� n:���
		
		Calendar cal=Calendar.getInstance();   //���� ��¥
		cal.set(y,m-1,d);
		w=cal.get(Calendar.DAY_OF_WEEK);
		System.out.printf("��¥ : %tF\n",cal);
		 
	//clone() : ��ü ����(�ּҴ� �ٸ����� ���� ����(���� ������))
	/*  Calendar sday=(Calendar)cal.clone(); �Ʒ� 2�ٰ� ����
		Calendar sday=(Calendar.getInstance();
		sday.set(y,m-1,d); 
	*/
		
	// sday(�ֽ�����) �ּҴ� �ٸ��� ���� ����		
		Calendar sday=(Calendar)cal.clone();
		n=w-1; //���Ͽ��� 1�� �� ĭ��ŭ ������ �̵�
		sday.add(Calendar.DATE,n*-1); //n�� ����������
		System.out.printf("�� ����: %tF\n",sday); //

	//	eday(�ָ�������)�ּҴ� �ٸ��� ���� ����.
		
		Calendar eday=(Calendar)cal.clone();
		eday.add(Calendar.DATE,7-w);
		System.out.printf("�� ������: %tF\n",eday);
	
	}
}
