package test0214;

public class StringBuilder_Ex11 {
	public static void main(String[] ss) {
		//다음처럼 코딩하면 안된다.
		//계속 생성,삭제를 반복하면서 만들어져서 속도가 느려진다.
		String s="서울";
		s+="부산";
		s+="대구";
		s+="인천";
		s+="광주";
		
		//이거는 입력이 되기전에 + 한거여서 가능하고, 처리속도도 빠르다.
		String n="서울"+"광주";
	}
}
