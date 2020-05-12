package test0130;

public class BookEx2 {

	public static void main(String[] args) {
		char c1 ='a'; //왜 코드값97로 저장이 되는지 몰르겠습니다... char이 정수형이여서 그런건가요?
		char c2 =c1;  //c1값을 c2에 저장
		char c3 =' '; //c3는 공백으로 초기화한다.
		
		int i = c1 +1; //97+1 //98
		
		c3= (char)(c1+1); //c1+1 결과가 int이므로 char형 c3에 저장하기 위해서는 char로 형변환 필요.
		c2++;  //후위++ //97 
		c2++;  //후위++ //98
		
		System.out.println("book103p"); //책예제 103p
		System.out.println("i="+i); //i=98 
		System.out.println("c2="+c2); //c2=c //99=c의 코드값
		System.out.println("c3="+c3); //c3=b //98=b의 코드값

	}

}
