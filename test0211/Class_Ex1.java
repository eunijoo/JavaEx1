package test0211;

public class Class_Ex1 {  //class 앞의 public은 저장된 클래스명앞에 한번만 쓸수있다.
					//외부접근이 가능한 class

	public static void main(String[] args) {
	
	//(3)객체생성(메모리할당) <ex>붕어빵 주문 및 구움. //클래스를 생성하면 무조건 아버지가 있음.
		//참조변수선언(레퍼런스변수)
		Rect oo;  //클래스명 + 변수명
		
		//메모리 할당 : 변수명 = new 클래스명();  <ex>붕어빵아저씨부름
		oo= new Rect(); //생성자(메모리할당 밖에 못함)를 불러야 메모리할당할수있다. 
						//생성자를 안만들면 컴파일할때 자바가 자동으로 디폴트생성자를 만든다.
		
		//클래스의 필드,메소드에 접근 <ex>붕어빵 주문(팥,슈크림 변경가능)
		oo.width=10;
		oo.heigth=5;
		
		int a,b;
		
		a=oo.area();
		b=oo.len();
		
		System.out.println("넓이 : "+a);
		System.out.println("둘레 : "+b);
	}

}
/*
	-사각형 넓이,둘레 구해라.
	 - (1)추상화 <ex> 붕어빵만들기위해 재료,도구준비,해야할일 정리
	 	- 필드(속성,데이터) :가로,세로
	 	- 메소드(행위) :넓이계산.둘레계산
*/
//(2)클래스생성(추상화 한 것을 자바언어로 바꿈)
class Rect{ // <ex>붕어빵틀
	//필드(인스턴스 변수) 
	
	//private int width; //private : 해당 클래스(class Rect)에서만 사용가능(외부접근제한)//자식도 접근제한됨
	int width;
	int heigth;
	
	//하나의 메소드엔 하나의 기능만 만든다.
	
	//넓이 메소드
	public int area() {
		int result;
		result=width*heigth;
		return result;
	}
	//둘레 메소드
	public int len() {
		int result;
		result=(width+heigth)*2;
		return result;
	}
	
}