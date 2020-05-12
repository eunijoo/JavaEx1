package test0129;

public class TypeEx1 {
	public static void main(String[] args) {
		float a,b; //단정도형 실수
		double c,d; //배정도형 실수
		
	  //a=0.5; //컴파일오류.0.5는 배정도형 리터널이므로 단정도형에 대입불가
		a=0.5f; //0.5F는 단정도형 리터널
		b='A'; //char < int < long < float < double
		
		c=0.5; //배정도형
		d=0.5d; //배정도형
		
		System.out.println(a+" , "+b+" , "+c+" , "+d);
	}
}
