package test0217;

import java.util.Calendar;

public class Calendar_Class_Ex6 {

	public static void main(String[] args) {
//�����̰� 2020�� 2�� 10�� ����ģ���� ó�� ������. 100�� �Ĵ�?
		
		Calendar cal=Calendar.getInstance();
		
	//2020�� 2�� 10�Ϸ� ����(���� �־���)
		
		cal.set(2020,2-1,10);  //���� �ε������̹Ƿ� ���� �����ö�+1  ���� �־��ٶ� -1
	
	//100�� �Ĵ�?
		
		cal.add(Calendar.DATE,100);
		System.out.printf("%tF\n",cal);
	
//���� ��Ҵ��� ���
		Calendar now =Calendar.getInstance();
		//System.out.println(now.getTimeInMillis()); // ���糯¥�� millisecond ���� ����
		
	//���糯¥�� 1970sus 1�� 1�� �������� ms�� ȯ��
		System.out.println(now.getTimeInMillis());
		
		cal.set(1992,9-1,6);	
		long days = ((now.getTimeInMillis()-cal.getTimeInMillis())/(1000*60*60*24));	
		System.out.println(days);
	}

}
