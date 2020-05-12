package test0220;

public class Interface_EX8 {

	public static void main(String[] args) {
		//Demo ob=new Demo8(); //컴오류. 추상클래스 객체 생성불가
		Test8 ob=new User8(); //업캐스팅
		ob.print();

	}	
}

interface Test8{ //아버지
	public void print();
	public void write();
}

abstract class Demo8 implements Test8{  //재정의해야함
	public void print() {
		System.out.println("print...");
	}
}

class User8 extends Demo8{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
}

