package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_UserException_Ex16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User16 user=new User16();
	
		try {
			System.out.println("이름");
			user.setName(sc.next());
			System.out.println("나이?");
			user.setAge(sc.nextInt());
			
			System.out.println(user.getName()+":"+user.getAge());
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		} catch (AgeValidException e) {
			System.out.println("나이입력오류에요..");
		} catch(Exception e) {
		System.out.println(e.toString());
		}finally {
			sc.close();
		}
		System.out.println("end...");
	}
}
//사용자 정의 예외클래스//메세지 보내려면 생성자 만들어야함
class AgeValidException extends Exception {

	private static final long serialVersionUID = 1L; //시리얼번호가 맞는지 확인해주는 함수(꼭 안붙여도 컴파일러가 알아서 생성)

	public AgeValidException(String msg){ //생성자
		super(msg);
	}
	
}

class User16{
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
	public void setAge(int age) throws AgeValidException {  //내가 만든 예외를 던짐
		if(age<0) {
			throw new AgeValidException("나이는 0보다 크거나 같아야한다.");
		}
				
		this.age = age;
	}
		
}