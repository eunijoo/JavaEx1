package test0218;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_Format_Ex4 {
	public static void main(String[] args) {
		DateFormat df;
		Date date =new Date();
		String s;
		
		df=DateFormat.getDateInstance();  //�⺻���� 2020. 2. 18 ���
		df=DateFormat.getDateInstance(DateFormat.LONG,Locale.KOREA); //�ѱ��ð��������� ����(2020�� 2�� 18�� (ȭ))

		s=df.format(date);
		
		System.out.println(s);
	}

}