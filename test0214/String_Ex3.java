package test0214;

public class String_Ex3 {
	public static void main(String[] args) {
		String s1="seoul"; //s2와 같은주소가르킴
		String s2="seoul";//s1와 같은주소가르킴
		
		System.out.println(s1==s2);  //true
		
		s1+="korea"; // String에서의 +는 문자열 결합.  //문자열 결합은 연산속도가 느려져서 실무에선 안씀.

		//자바에서 문자열은 불변의 법칙(값을 변경할수없음)=> 문자열이 추가되는게 아니라. 새로운 메모리를 할당받아서 저장됨.
		System.out.println(s1==s2); //false   //s1이 새로운 메모리를 할당받아서 주소가 달라짐.
		System.out.println(s1);//seoulkorea
		System.out.println(s2);//seoul
		
		String_Ex3 ob=new String_Ex3();
		
		//String s=ob;//컴오류
		
		String s="seoul"+ob; //"문자열" + "패키지명.클래스명@해쉬코드"
		System.out.println(s);
		
	}
}
