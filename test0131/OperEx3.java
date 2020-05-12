package test0131;

public class OperEx3 {

	public static void main(String[] args) {
		short a;
		byte b;
		int c;
		long d;
		
		a=10;
		c=a;//자동으로 형변환이 일어난다. //a가 int형으로 형변환해서 c로 들어간다.
		
		//b=a; //오류, 큰것을 작은것에 대입불가 //short형이 byte형보다 크다.
		b=(byte)a; //강제로 형변환
		System.out.println(b); //10
		
		a=200;
		b=(byte)a; //강제로 형변환.overflow발생.잘림현상
		System.out.println(b); //-56
		
		c='A'+10;//char +int =>int+int
		System.out.println(c);//75
		
		c=1000000;
		//d= c*c; //int*int =>int(계산에서 잘림 일어난 후에 d로 넘어감)=>long //-727379968
		d= (long)c*c; //long(강제로 형변환)*int =>long =>long  //1000000000000
		System.out.println(d); 
		
		int e=1,f=2;
		double g;
	 // g=e/f;  // int/int =int(소숫점없어지고 0(정수)만 계산됨)=>g가 double형이여서 0.0이 됨(소수점생김)
		g=(double)e/f; //e가 강제로 double로 형변환됨 //1.0/2로 계산되어 0.5가 나옴 
		System.out.println(g); //0.5
		

	}

}
