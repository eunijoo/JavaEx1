package test0217;

import java.util.Calendar;

public class Calendar_Class_Ex8 {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		System.out.printf("%tF\n",cal);
		
		cal.set(Calendar.MONTH, 15);  //15���� ����µ� 15���� ������ �����⵵�� �Ѿ.
		System.out.printf("%tF\n",cal);
		
		cal.set(Calendar.DATE, 50);   // 50���� ����µ� �ϼ��� ������ �������� �Ѿ��.
		System.out.printf("%tF\n",cal);	
	}
}
