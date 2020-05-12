package test0221;

//0이상일때만 프로그램실행. 0미만은 오류시키기/.
public class Exception_RuntimeException_Ex14 {

	public static void main(String[] args) {// main은 javaVM이 부름 // 예외를 호출한애한테 떠넘기겠다.
		User14 ob=new User14();
		
		try {
		ob.set(-10);
		int n=ob.getAge();
		System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}

class User14{
	private int age;
	
//gettersetter로 자동채움
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("나이는 0이상이다.");
	//		Exception e = new Exception("나이는 0이상이다."); //윗줄과 같은말.
		}
		this.age = age;
	}
	public void set(int age) throws Exception {
		try {
			setAge(age);
		} catch (Exception e) {
		//	System.out.println(e.toString());
			throw e; //Exception객체를 던짐(잡은 예외를 다시 던진다.)
		}
	}
	
}