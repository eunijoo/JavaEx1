package test0131;

public class OperEx4 {

	public static void main(String[] args) {
		char a='A';
		char b;
		
		b='A'+3; //리터널연산은 형변환이 일어나지 않는다.
		System.out.println(a+","+b);
		
		//b=a+3; //에러, int로 형변환이 일어나서 오류
		b=(char)(a+3);
		System.out.println(a+","+b);
			
		b=60+20; //가능하다.
		System.out.println(b);
		//byte,short,char,int 에 따라 달라진다.
		//1-9 까지 가능(숫자)//형변환이 일어나지 않는다.
	}

}
