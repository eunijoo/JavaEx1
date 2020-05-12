package test0221;

//0이상일때만 프로그램실행. 0미만은 오류시키기/.
public class Exception_RuntimeException_Ex13 {

	public static void main(String[] args) {// main은 javaVM이 부름 // 예외를 호출한애한테 떠넘기겠다.
		User13 uu = new User13();
		/*
		 * uu.setValue(-3); //value 가 0보다 적어서 RunTimeException 예외발생 //예외처리를 하지 않아 프로그램은
		 * 이곳에서 강제 int n=uu.getValue(); System.out.println(n);
		 * System.out.println("end..."); }
		 */
		
		try {
			uu.setValue(-3); // value 가 0보다 적어서 RunTimeException 예외발생
			// 예외처리를 하지 않아 프로그램은 이곳에서 강제
			int n = uu.getValue();
			System.out.println(n);

		} catch (Exception e) {
			System.out.println(e.toString()); 
		}
		System.out.println("end...");

	}
}
class User13 {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value < 0) {
			// RuntimeException: unchecked 예외로 반드시 catch 할 필요없다.
			throw new RuntimeException("0이상만 가능합니다.");
		}
		this.value = value;
	}

}