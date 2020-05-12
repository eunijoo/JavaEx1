package test0211;

public class Class_Hap_Ex6 {  
	public static void main(String[] args) { //클래스변수 (static)
		
		int result;
		Test6 t= new Test6();
		result = t.even();
		System.out.println(result);
		
		//t.even();// 가능
		
	}
}

class Test6{
	int a;//필드(인스턴스변수) . 힙 메모리 공간에 객체가 생성되는 수만큼 메모리할당.
	      //객체가 10개면 a변수도 10개메모리할당.

//인스턴스메소드(객체생성안하면 안됨)
//1~100까지 짝수합구하기
	public int even() {
		int s=0;//지역변수. 메소드 안에서만 사용가능.
				//초기화가 반드시 필요.
				//메소드를 호출할때(부를때) 메모리 할당.
				//메소드를 벗어나면 저장된 값은 사라짐
				//스택메모리 공간에 저장
		for(int i=2;i<=100;i+=2) {
			s+=i;
		}
		return s; //return을 만나면 호출한 곳으로 돌아감.
				  //return 아래에 코드를 작성하면 오류발생.
				  //리턴하는 값은 메소드 리턴타입보다 적거나 같아야함.
				  //리턴타입이 void인  경우에는 생략가능하며,
				  //	return;처럼 생략하지 않은 경우에는 리턴다음에 아무것도 기술하지 않는다.
		//System.out.println(a); //컴오류
	}
}