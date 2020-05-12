package test0220;

public class Interface_EX7 {

	public static void main(String[] args) {
		User7 ob=new User7();
		Test7 tt=new User7(); //업캐스팅
		
		tt.write();
		((Demo7)tt).print(); //User7클래스가 Demo7인터페이스로 구현되어있으므로.
		
		Demo7 dd=ob; //업캐스팅 
		dd.print(); //데모는 프린트만 가지고 있어서 프린트밖에 안됨.
					//라이트 가져오고싶으면 다운캐스팅해서 User로 가면됨.
	}	
}

interface Demo7{
	public void print();
}

interface Test7{
	public void write();
}

//두개 이상의 인터페이스 구현 가능
class User7 implements Demo7, Test7{

	@Override
	public void write() {
		System.out.println("write...");
	}

	@Override
	public void print() {
		System.out.println("print...");
	}
}

