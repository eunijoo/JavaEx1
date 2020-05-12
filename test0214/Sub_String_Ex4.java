package test0214;

public class Sub_String_Ex4 {
	public static void main(String[] args) {
		String s="seoul korea";
		System.out.println(s);
		
		//문자열 길이
		System.out.println("길이 : "+s.length());
		
		//kor만 출력
		//인덱스는 0부터
		System.out.println("substring(6,9) : "+s.substring(6,9));//kor  //문자열 길이넘치면 오류.(뒤의 숫자가 커야됨)
			//substring(s,e) : s 인덱스에서 e-1 인덱스까지 s<=e 이고, e<length()아야함
		System.out.println("substring(6) : "+s.substring(6)); //korea
			//substring(s) :s인덱스에서 끝까지
		
		char c=s.charAt(6); //해당 인덱스의 문자
		System.out.println(c);
		
		System.out.println("equals : "+s.equals("seoul korea")); //문자열 비교
		System.out.println("equals : "+s.equals("Seoul KOREA")); //대소문자 구분
		System.out.println("equalsIgnoreCase : "+s.equalsIgnoreCase("Seoul KOREA")); //대소문자구분하지 않음.
		
		// 문자열이 "seoul"로 시작 여부
		System.out.println("startsWith : "+s.startsWith("seoul"));
		
		//문자열이 "korea"로 끝나는지 여부
		System.out.println("endsWith : "+s.endsWith("korea"));
		
	//"seoul korea"와 "seoul corea"는 누가 더 클까?
		//사전식 배열 (ASCII코드 차이)
		System.out.println("compareTo : "+s.compareTo("seoul corea"));
		//문자열은 >,<,== 으로 비교불가 (>,<는 숫자 비교하는것, ==은 주소비교)
		
		//"kor"의 위치는 어디지?
		System.out.println("indexOf : "+s.indexOf("kor"));
		System.out.println("indexOf : "+s.indexOf("busan"));
				//있으면 0부터 , 없으면 -1  //indexOf : 있냐없냐 찾는것
		
		//처음부터 찾는다.
		System.out.println("indexOf : "+s.indexOf("o"));
		
		//인덱스 3부터 찾는다.
		System.out.println("indexOf : "+s.indexOf("o",3));
		
		//뒤에서 부터 찾는다. //lastIndexOf : 확장자 찾을 때 많이씀.
		System.out.println("lastIndexOf : "+s.lastIndexOf("o"));
		
		//한글을 한문으로 변경
		s="우리나라 대한민국 대한독립 만세 대한의 건아";
		s=s.replaceAll("대한", "大韓");
		//System.out.println(s.replaceAll("대한", "大韓"));
		System.out.println("replaceAll(대한-> 大韓 변경) : "+s);
		
		//중간의 숫자삭제 
		//정규식 : 패턴검사하는 식 (\d로 인식)  //replace은 정규식을 쓸수없다.
		s="우리123나라 대한56민국";
		s=s.replaceAll("\\d", ""); //숫자 없앰  ( \\d : 숫자를 의미하는 것.)
		System.out.println(s);
		
		//숫자 삭제
		s="자바 123 스프링 345 HTML";
		s=s.replaceAll("[0-9]", ""); // 숫자 없앰;.
		System.out.println("[0-9] : "+s);
		
		//숫자,공백 삭제
		s="자바 123 스프링 345 HTML";
		s=s.replaceAll("\\d|\\s", ""); //  \\d|\\s  : 숫자 또는 공백
		System.out.println("\\d|\\s : "+s);
		
		//영어,숫자,공백 삭제
		s="자바 123 스프링 345 HTML";
		s=s.replaceAll("\\w|\\s", ""); // \\w|\\s :영어숫자 또는 공백
		System.out.println("\\w|\\s : "+s);
		
		//숫자만 출력
		s="자바 123 스프링 345 HTML";
		s=s.replaceAll("[^0-9]", ""); //  [^0-9]  :숫자만 나오게함
		System.out.println("[^0-9] : "+s);
		
		//문자열을 패턴으로 분리하여 배열 변환.
		String[] ss="java,html,css".split(",");//split 정규식사용가능
		for(String a:ss) {
			System.out.print(a+"  ");
		}
		System.out.println();
		
		String[] ss2="010-0000-1111".split("-");
		for(String a:ss2) {
			System.out.print(a+"  ");
		}
		System.out.println();

	}
}
