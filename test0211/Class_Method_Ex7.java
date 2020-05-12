package test0211;

public class Class_Method_Ex7 {  
	public static void main(String[] args) { //클래스변수 (static)
		Test7 tt=new Test7();
		int result;
		result=tt.sum(20);
		System.out.println("결과 : "+result);
		
		System.out.println("4는 짝수인가?? "+tt.isEven(4));	
		System.out.println(tt.upper('a'));
		System.out.println(tt.isUpper('A'));
		
		result = tt.sum2(10, 1);
		System.out.println(result);
		
		tt.gugu(15); //void 메소드는 값을 반환받지 않는다.
		
		double n =tt.grade(50);// return은  int로 선언되어있어서 double형으로 다시 준다;
		System.out.println(n);
	}
}

class Test7{
	//1~n까지 합을 구하는 메소드
	public int sum(int n) {//매개변수(파라미터)
		//매개변수는 지역변수와 동일하게 스택메모리 공간확보
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		return s;
	}
	
	//매개변수로 전달된 정수가 짝수인지 판별하는 메소드
	public boolean isEven(int n) {
		return n%2==0;
	}	
	
	//매개변수로 전달된 문자중 소문자를 대문자로 변환하는 메소드
	public char upper(char ch) {
/*		
		char c;
		c=ch>='a'&&ch<='z'?(char)(ch-32) :ch;  //결과값이 정수가 나오니깐 char로 형변환
		return c;
*/
		return ch>='a'&&ch<='z' ? (char)(ch-32) : ch;  //위의 구문을 한줄로 작성한것.
		
		}
		
	//매개변수로 전달된 문자가 대문자인지 판별
	public boolean isUpper(char ch) {
		return ch>='A' && ch<='Z';
	}
	
	//두 정수를 매개변수로 전달받아 적은수에서 큰수까지 합(매개변수 2개)
	public int sum2(int a,int b) { //매개변수(=파라미터,가인수)는 자료형을 각각준다. (int a,b)안됨
		int t,s;
		if(a>b) {
			t=a; a=b;b=t;
		}
		s=0;
		for(int i=a;i<=b;i++) {
			s+=i;	
		}
		return s;  //리턴타입이  void가  아니므로 생략불가.
				   //return문이 없으면 컴파일에러
	}
	
	//출력만하고 되돌려 줄 값이 없다.
	public void gugu(int dan) {
		if(dan<1 || dan>9) {
			System.out.println("**단 입력 오류**");
			return; //리턴타입이 void인 경우 생략가능.컴파일러가 자동추가
		}
		System.out.println("**" + dan+ "**");
		for(int i=1; i<=9;i++) {
			System.out.printf("%d*%d=%2d\n",dan,i,dan*i);
		}
		return; //리턴타입이 void인 경우 생략가능.컴파일러가 자동추가
				//리턴타입이 void는 메소드를 실행  후 호출한 곳으로 값을 넘겨줄것이 없는 경우 작성한다.
	}
	
	//파라미터로 전달받은 점수를 이용하여 평점계산
	//95~100 : 4.5, 90~94:4.0, ... ,60~64:1.0,59~0: 0.0
	//메소드명 : grade(int s)
	public double grade(double s) {		
		double n;
		
		if(s>=95) {
			n=4.5;
		}else if(s>=90){
			n=4.0;	
		}else if(s>=85){
			n=3.5;	
		}else if(s>=80){
			n=3.0;	
		}else if(s>=75){
			n=2.5;
		}else if(s>=70){
			n=2.0;
		}else if(s>=65){
			n=1.5;
		}else if(s>=60){
			n=1.0;
		}else{
			n=0.0;
		}	
		return n;
	}
}
