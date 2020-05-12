package test0219;

public class InheritanceEx2 {

	public static void main(String[] args) {
		Test2 tt=new Test2(); //객체생성
		tt.print();
		
		System.out.println(tt.a+":"+tt.b+":"+tt.c+":"+tt.d);//10:20:200:300
		//	System.out.println(tt.super.c);//컴오류.해당 클래스 외부에서 super 사용불가능.
		
		System.out.println(((Demo2)tt).c); //30 (아버지꺼)
	}

}
//this/super : 클래스내에서만 사용가능(외부에서 사용 불가능)
//this :객체 자기 자신을 나타내는거(지역변수를 동일명으로 해줬을경우 this를 안쓰면 지역변수가 출력됨)
//다른 생성자를 부를땐 this를 쓴다.
//생성자는 new 다음에만 올수있다. 
//super: 아버지꺼  //나랑 아버지 둘다 있는건데 아버지껄 쓰고싶을때 사용


class Demo2{	//아버지클래스
	int a=10;
	int b=20;
	int c=30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test2 extends Demo2{ //자식클래스
	int c=200;
	int d=300;
	
	/*	//생성자를 내가 안만들어줘서 컴파일러가 알아서 만들어준다. 내용은 숨어져있다.
	public Test2() { //디폴트생성자 생성: { }속에 내용도없고,( )속에 인자도없음
		super(); //디폴트생성자에 해당내용이 숨어져있다.
	}
	 */
	
	public void print() { //지역변수를 새로 선언해줬을때  this를 안써주면 지역변수가 출력됨.
		int a=1;
		System.out.println(a+":"+b+":"+c+":"+d);	//10(이버지꺼) : 20(아버지꺼) : 200(자식꺼):300(자식꺼)
		System.out.println(this.a+":"+this.b+":"+this.c+":"+this.d);  //아버지꺼도 내꺼니깐 내꺼그대로나옴
		System.out.println(super.a+":"+super.b+":"+super.c+":"+this.c); //super: 아버지꺼 가져옴
	}
}