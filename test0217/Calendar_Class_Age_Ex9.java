package test0217;

import java.util.Calendar;
//������ ���
public class Calendar_Class_Age_Ex9 {

	public static void main(String[] args) {
		Calendar now= Calendar.getInstance();
		Calendar cal= Calendar.getInstance();
		
	//�ڱ���� ����
		cal.set(1992,9-1,6);
		
	//���̰��(�� ���̷� ���)
		int age =now.get(Calendar.YEAR)-cal.get(Calendar.YEAR);
		
	//������ �������� ���, ������ ���������� -1	
		if(cal.get(Calendar.MONTH)> now.get(Calendar.MONTH) ||      //���� �������ų�
		   cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&    //���� ���̰ų�
		   cal.get(Calendar.DATE)> now.get(Calendar.DATE)) { 		//��¥�� �������ų�
			
			age--;			
		}	
		System.out.println("���� : " +age);
	}
}
