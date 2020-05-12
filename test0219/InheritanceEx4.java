package test0219;

public class InheritanceEx4 {
public static void main(String[] args) {
	//Demo4 dd=new Demo4();  //컴오류. 인자가 없는 생성자가 없어서 인자값을 넣어줘야함.
	Demo4 dd=new Demo4(5); 
	dd.print();
}
}



class Demo4{  //아버지의 생성자가 다 인자가 있음
	int a;
	
	public Demo4(int a) {
		this.a=a;
		System.out.println("Demo4인자있는 생성자");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Test4 extends Demo4{
	//생성자를 만들지 않으면 오류 : 상위 클래스가 인자있는 생성자만 존재하므로.
	//반드시 생성자를 만들고  'super(값);' 를 이용하여 반드시 상위클래스 생성자를 호출해야함
	public Test4() {  //생성자 생성
		super(10);		//반드시 super(값);
	}
}