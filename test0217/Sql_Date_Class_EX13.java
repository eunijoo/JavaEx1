package test0217;

import java.sql.Date;

public class Sql_Date_Class_EX13 {
	public static void main(String[] args) {
		Date date = new Date(new java.util.Date().getTime());  //sql �����Ϳ��� ���ڰ� ���� �����ڰ� ����. ���ڰ��־������.
		//�����ͺ��̽��� ����� ��¥�� �ð������� �����ͷ� �����ϰų� �����ͺ��̽��� �����Ҷ� ���.
		//getTime() : 1970����ؽð�
		
		System.out.println(date.toString()); // ���� ��¥ ��� 2020-02-17
		//toString() : Date��ü�� yyyy-mm-dd������ String���� ��ȯ�Ѵ�.
		
		
		
	}
}
