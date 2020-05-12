package test0212;

public class Method_Ex2 {
	public static void main(String[] args) {
		Test2 t=new Test2(); //무조건 생성해줘야함
		int score=80;
		String s;
		
		s=t.hak(score);  //score값 : 80
		System.out.println(s);
		
		short n=10; 
		int a;
		
		a=t.odd(n); //보내는 실인수는 받는 가인수보다 자료형이 적거나 같아야함.((int s)의 int>(short n)short여서 가능)
		System.out.println(a);
		
	//	a=t.odd(10L);//컴오류
		
		double d=t.odd(10);//리턴자료형보다 받는 자요형은 크거나 같아야한다.
		System.out.println(d);
	}

}

class Test2{
	//수우미양가
	public String hak(int s) {
		//String h; //객체(참조변수) //초기값을 안줘서 쓰레기값
		String h=null; //초기화는 됐는데 주소가 없음	
		switch(s/10) { 
		case 10:
		case 9: h="수"; break;
		case 8: h="우"; break;
		case 7: h="미"; break;
		case 6: h="양"; break;
		default: h="가"; break;
		}
		
		return h; //어떠한 경우라도 하나만 리턴가능.
	}
	
	//홀수합
	public int odd(int n) {
		int s=0;
		for(int i=1;i<=n;i+=2) {
			s+=i;
		}
		return s;
	}
}
