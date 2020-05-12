 package test0219;

public class OverridingEx7 {
	public static void main(String[] args) {
		
		Demo7 dd1=new Demo7();
		Demo7 dd2=new Demo7();
		System.out.println(dd1.equals(dd2)); //주소비교 .false
											//Object의 equals()호출
		System.out.println(dd1);
		System.out.println(dd1.toString());  //클래스이름@해쉬코드
		
		Test7 tt1=new Test7();
		Test7 tt2=new Test7();
		System.out.println(tt1.equals(tt2)); //주소비교. true // 1>
							//Test7에 재정의된 equals()호출
		
		System.out.println(tt1);	//100
		System.out.println(tt1.toString());	//100
//나한테 먼저찾고 존재하지않으면 아버지한테 찾는다. 아버지한테도 없으면 에러.
	}
}
class Demo7{
	int a=10;
	public void print() {
		System.out.println(a);
	}
}
class Test7{
	int a=100;
	public void print() {
		System.out.println(a);
	}

//equals 재정의 //아버지의 equals가 어떻게 만들어졌는지모르면 재정의 불가
	@Override 
	public boolean equals(Object obj) {  //obj가 tt2받음
		Test7 t = (Test7)obj;	//obj는 1>의 tt2
		return this.a==t.a;		//this는 1>의 tt1
	//	return a==t.a; //위랑 같은말
	}

//toString 재정의 //값이 출력됨
	@Override
	public String toString() {
		return "a:"+a;
	}	
	
}

