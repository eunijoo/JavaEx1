package test0217;

import java.sql.Date;

public class Sql_Date_Class_EX13 {
	public static void main(String[] args) {
		Date date = new Date(new java.util.Date().getTime());  //sql 데이터에는 인자가 없는 생성자가 없다. 인자값넣어줘야함.
		//데이터베이스에 저장된 날짜나 시간정보를 데이터로 추출하거나 데이터베이스에 저장할때 사용.
		//getTime() : 1970년기준시간
		
		System.out.println(date.toString()); // 오늘 날짜 출력 2020-02-17
		//toString() : Date객체를 yyyy-mm-dd형식의 String으로 변환한다.
		
		
		
	}
}
