package test0217;

import java.util.Calendar;

public class Calendar_Class_Ex5 {

	public static void main(String[] args) {
		//Calendar : �߻� Ŭ����(�̿ϼ� Ŭ����)
					//�߻� Ŭ������ ��ü�� ���� ���� �Ұ�
	//	Calender cal = Calender.getInstance(); //�Ŀ���
	//	Calender cal = new Calender(); //�Ŀ���
		
/*
		- ��ü ���� ���
		1> Calendar cal=Calendar.getInstance();
		2> Calendar cal=new GregorianCalendar();
		3> GregorianCalendar cal=new GregorianCalendar();
		GregorianCalendar : Calendar Ŭ������ ����Ŭ����
 */
		Calendar cal=Calendar.getInstance();  //��ǻ�ͽý����� ��¥,�ð��� ������ �ִ�.
		
		String s= String.format("%tF %tA %tT",cal,cal,cal); // ���� �����, ����,�ð� ���
	//	String s1= String.format("%1$tF %1$tA %1$tT",cal); // ���� �����, ����,�ð� ���
		System.out.println(s);
		
	//��,��,��,���� �Լ��� ��������
		//�������°� get //�������°�  set
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH)+1; //+1�� ���ָ� 1������ ����
					//get(Calendar.MONTH)  : 0-11(�ε�������)���� ������
		int d=cal.get(Calendar.DATE);
		int w= cal.get(Calendar.DAY_OF_WEEK);
					//1~7:��~��
		String[]ww= {"��","��","ȭ","��","��","��","��"};	
		System.out.printf("%d�� %d�� %d�� %s����\n",y,m,d,ww[w-1]);
	
	//�̹����� ���ϱ��� �ִ��� ���	
		int days= cal.getActualMaximum(Calendar.DATE);
		System.out.println("�̹����� "+days+"�� ���� �ֽ��ϴ�.");
	}

}
