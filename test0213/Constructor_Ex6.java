package test0213;

public class Constructor_Ex6 {
	public static void main(String[] args) {
		Test6 ob=new Test6();
		ob.write();
		
	}
}

class Test6{
	private int n;
	
/*
 -- 생성자 :  - new를 이용하여 객체를 생성할때 호출.
 			- 초기화
 */
	
	//public void Test6() { //매소드
	public Test6() {  //생성자  //객체가 부를때마다 실행.
		n=10;
		System.out.println("인자없는 생성자");
	}
	
	
	public void write() {
		System.out.println(n);
	}
}
	
	
//1>new -> 2> Tset6으로옴 -> 3> 10줌

