package test0212;

public class Method_Ex1 {
	public static void main(String[] args) {
		Test1 t=new Test1(); //무조건 생성해줘야함
		
		t.print(); //10
		t.add(); 
		t.print(); //11 //바로위에서 add로 가서 a++해줌
		
		t.write(5); //5
	}
}

class Test1{
	int a=10; //인스턴스변수,필드는 클래스안에서는 전역변수 개념이다.
	
	public void add() {
		a++;
	}
	public void print() {
	//	int a=5; //(o)전역변수와 이름이 같아도 된다.
	//	int a=6; //(x)지역변수끼리 이름이 동일하면  안된다.
		System.out.println(a);
	}
	public void write(int a) { //a=매개변수 => 지역변수
		//int a; //(x)지역변수끼리 이름이 동일하면  안된다.
		// 필드와 지역변수(매개변수)는 변수명이 같을수있다.
		// 필드와 지역변수의 이름이 동일하면 우선순위는 지역변수가 높다.
		System.out.println(a);  //매개변수(지역변수) a
	}
}