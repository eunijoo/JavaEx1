package test0221;

import java.util.Scanner;

//0이상일때만 프로그램실행. 0미만은 오류시키기/.
public class Exception_Ex15 {

	public static void main(String[] args) {// main은 javaVM이 부름 // 예외를 호출한애한테 떠넘기겠다.
		Scanner sc=new Scanner(System.in);
		User15 user=new User15();
	
		try {
			System.out.println("이름");
			user.setName(sc.next());
			System.out.println("나이?");
			user.setAge(sc.nextInt());
			
			System.out.println(user.getName()+":"+user.getAge());
		} catch (Exception e) {
			System.out.println("입력오류입니다.");
		}finally {
			sc.close();
		}
		System.out.println("end...");
	}
}

class User15{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<10) {
			throw new Exception("나이는 0보다 크거나 같아야한다.");
		}
		
		
		this.age = age;
	}
	
	
}