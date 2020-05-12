package test0219;

public class OverridingEx6 {
	public static void main(String[] args) {
		Test6 ob=new Test6();
		ob.print();
	}
}
//재정의하려면 상하관계가 꼭있어야함.
class Demo6{
	int a=10;
	public void print() { // 1>
		System.out.println(a);
	}
}

class Test6 extends Demo6{
	int x=100;
	@Override //@Override 어노테이션 : 나는 overrding 했어요 라고 알려주는거 
	public void print() {  // 2>
	//	System.out.println(int x); //overloding이여서 오류(@Override로 검사함)
		System.out.println(a+":"+x);
	}
	
	public void fun() {
		print(); // 2> 호출
		super.print(); // 1> 호출  //아버지꺼부르는거니깐 super
	}
}

