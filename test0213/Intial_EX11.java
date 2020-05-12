package test0213;

public class Intial_EX11 {
	public static void main(String[] args) {
		Test11 ob=new Test11();//객체 생성
/*		 
    	new를 할때마다 1,2,3,4,5 순으로 진행
		 1> new -> 객체 생성 :인스턴스변수 a,b 메모리 할당
		 2> a <- 0 ,b <- 0는 디폴트값으로 초기화
		 3> 초기화 식 실행 : b <- 20
		 4> 초기화블럭을 실행
		 5> 생성자 몸체 실행되어 초기화 작업.
 */
		ob.write();
		
		//위의 1~5과정 다시 실행
		Test11 ob2=new Test11();//객체 생성
		ob2.write();
	}
}

class Test11{
	private int a;
	private int b=20;
	//a=10; //컴오류.실행문 올수 없음
	{
		//초기화 블럭(생성자에서도 가능)
		a=10;
		System.out.println("초기화 블럭,,,");
	}
	
	public Test11() {  //생성자 
		System.out.println("생성자...");
		
	}
	
	public void write() {
		System.out.println(a+":"+b);
	}
}
