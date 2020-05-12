package test0214;

public class Equals_String_Ex2 {
	public static void main(String[] args) {
		//문자열은 문자열상수영역에 저장(힙영역)  //문자열도 객체개
		String s1="seoul";
		String s2="seoul";
		//1> 문자열 저장하고, 저장된 주소를 s1에 대입
		//2> 동일한 문자열을 s2에 대입한 경우 s1에 "seoul" 저장된 "seoul"의 주소가 s2에 저장
		//   (동일한 문자열이면 더이상 자바가 메모리를 할당해주지 않음)
		String s3=new String("seoul");
		// new 는 새로운 메모리 할당.
		
		System.out.println(s1==s2); //주소비교.true
		System.out.println(s2==s3); //주소비교.false
		
		// String의 equals()는 문자열을 비교한다.
		System.out.println(s1.equals(s2));//값비교.true
		System.out.println(s1.equals(s3)); //값비교.true
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		//동일한 객체는 해쉬코드가 동일하지만 해쉬코드가 같다고 동일한 객체는 아니다.(문자열이여서 같은 해쉬코드가 나옴)
		System.out.println("s1:"+s1.hashCode());
		System.out.println("s2:"+s2.hashCode());
		System.out.println("s3:"+s3.hashCode());
		
	}
}
