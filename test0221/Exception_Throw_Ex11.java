package test0221;

//0이상일때만 프로그램실행. 0미만은 오류시키기/.
public class Exception_Throw_Ex11 {
										//throws Exception : 메소드를 호출한곳으로 예외를 넘김
	public static void main(String[] args) throws Exception{// main은 javaVM이 부름 // 예외를 호출한애한테 떠넘기겠다.

		User11 ob = new User11();

		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}
}

//잘못 작성된 경우. 
class User11 {
	private int value;

	public void setValue(int value) throws Exception { // 메소드를 호출하는 곳에서 예외를 catch하도록 설정
		if (value < 0) {
			throw new Exception("0이상만 가능합니다."); // 강제로 checked 예외를 발생(문제를 일으킴)(Exception 예외발생)

		}
		this.value = value;

	}

	public int getValue() {
		return value;
	}
}
