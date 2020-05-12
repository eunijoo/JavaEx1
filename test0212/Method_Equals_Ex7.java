package test0212;

public class Method_Equals_Ex7 {  //main과 같은 class 안에 있음
	public static void main(String[] args) {
	
		String s1="서울"; //s1과 s2가 같은 값이여서 공간이 하나만 만들어짐.
		String s2="서울"; // 똑같은거면 공간을 안만듬
		String s3=new String("서울");  //new는 무조건 메모리공간을 새로 만듬
		
		System.out.println(s1+":"+s2+":"+s3); //서울 : 서울 : 서울
		
		// (==) : 객체는 주소를 비교
		System.out.println(s1==s2); //true //문자열의 주소비교
		System.out.println(s1==s3); //false //문자열의 주소비교
		System.out.println(s1.equals(s3)); //true //equals : 문자열의 값을 비교하라는것
	}
}
//문자열은 객체 -> 힙공간에 메모리할당.
//원래는 힙공간에 문자열의 주소가 저장되는데 문자열은 문자열(값)이 저장하게 할수있음.

	
	

