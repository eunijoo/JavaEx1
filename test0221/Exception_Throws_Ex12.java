package test0221;

//0이상일때만 프로그램실행. 0미만은 오류시키기/.
public class Exception_Throws_Ex12 {
	
	public static void main(String[] args) {// main은 javaVM이 부름 // 예외를 호출한애한테 떠넘기겠다.

		User12 ob = new User12();

		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}
}

//잘못 작성된 경우. 
class User12 {
	private int value;

	public void setValue(int value) { // throws Exception { // 메소드를 호출하는 곳에서 예외를 catch하도록 설정
		try {
		if (value < 0) {
			throw new Exception("0이상만 가능합니다."); // 강제로 checked 예외를 발생(문제를 일으킴)(Exception 예외발생)
		}		
		this.value = value;
	}catch(Exception e) { //throw new Exception("") 한 것을 catch함
		//예외를 이곳에서 catch해서 메소드를  호출한 곳에서는 예외를 잡을 수 없다.
		//잘못 작성된 코드가 될 수 있다.
		System.out.println(e.toString());
	}
	}

	public int getValue() {
		return value;
	}
}
