package test0217;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormat_Ex11 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
//SimpleDateFormat : 날짜를 ->문자로 /문자->날짜로 변환하는데 쓰는 클래스
		
/* 권장하지 않는다.		
		int y=d1.getYear()+1900;
		int m=d1.getMonth()+1;
		int d=d1.getDate();   //글씨위의 줄 : 함수를 쓰고싶으면 쓰는데 문제가 생기면 나는 책임안지겠다는 뜻.(자바가 쓰는거 원하지 않음)
		System.out.println(y+"-"+m+"-"+d);
*/
		
		//1970년 1월 1일 0시 0분 0초 기준으로 ms로 반환
		long t=d1.getTime();
		System.out.println(t);
		
		Date d2=new Date(158190878880L);
		System.out.println(d2);
		
		System.out.println(d1.after(d2));//d1이 d2보다 뒤에 있니? (true/false)
		
	//Date형을 String으로 변환 (Date를 내가 원하는서식으로 출력하고 싶음)
		SimpleDateFormat f=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String s=f.format(d1);
		System.out.println(s);
		
	//String을 Date형으로 변환
		//String s2 = "2000-10-20"; 과 SimpleDateFormat("yyyy-MM-dd"); 형식이 같아야함.
		String s2 = "2000-10-20";
		SimpleDateFormat f2=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=f2.parse(s2);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		} //parse :위험성내포(변환이 될 수도 있고,안 될수도 있음)=>형식이 맞는지 검사(if문)=>(예외처리해야함)

		
		
	}
}
