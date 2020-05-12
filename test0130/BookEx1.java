package test0130;

public class BookEx1 {
	public static void main(String[] args) {
		String name = "JA"+"VA"; //선언과 동시에 값을 줌
		String str = name +8.0; //strig이라서 8.0이 문자로 선언됨?
		
		System.out.println("book35p"); //책35p 예제
		System.out.println(name);    //JAVA  //name값 출력
		System.out.println(str);     //JAVA8.0  //str값 출력
		System.out.println(7+'A');   //72  //정수+문자 일 경우 문자가 정수로 계산된다 ? 7+65(ASCII)=72가 됨
		System.out.println('A');     //A   //문자그대로 출력 
		System.out.println('A'+7);   //72  //문자+정수
		System.out.println("A"+7);   //A7  //문자열+정수=문자열
		System.out.println(7+7+'A'); //79  //(정수+정수)+문자
		System.out.println('A'+7+7); //79  //(문자+정수)+정수
		System.out.println("haha"+7+7); //haha77 //(문자열+정수)+정수 ?
		System.out.println(7+7+"haha"); //14haha //(정수+정수)+문자열  	
	}
}
	