package test0214;
/*
 StringBuffer,StringBuilder
 	:가변적인 문자열을 처리하는경우 String 보다 유리
 	StringBuilder:
 	StringBuffer:동기화 지원.멀티스레드에서 안전
 
 */
public class StringBuffer_Ex13{
	public static void main(String[] ss) {
		StringBuffer sb1=new StringBuffer("korea");
		StringBuffer sb2=new StringBuffer("korea");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1==sb2); //false. 주소비교
		System.out.println(sb1.equals(sb2)); 
				//false. 주소비교. String(값비교)과는 다름
				//문자열을 비교하기위해서는 String으로 변환
		
	//문자열로 변환
		String s=sb1.toString();
		System.out.println(s);
		
	//문자열 비교
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		
	//문자열 길이
		System.out.println("길이 : "+sb1.length()); //korea 5글자
		
	//초기버퍼크기
		StringBuffer sb3=new StringBuffer();
		System.out.println("초기버퍼크기 : "+sb3.capacity()); 
		
	//뒤에 문자열추가
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("대한민국");
		sb3.append("우리나라");
		sb3.append("자바");
		sb3.append("스프링");
		System.out.println("버퍼 크기 : "+sb3.capacity());//버퍼크기:34, 버퍼가 부족하면 자동으로 늘림.
		
		System.out.println(sb3);
		
		System.out.println(sb3.indexOf("자바"));
		
	//소문자를 대문자로 변경 
		String s2=sb3.toString();
		System.out.println(s2.toUpperCase());
	
	//서울앞에 한국을 넣고싶음.
		sb3.insert(0, "한국"); //처음에 한국을 넣음
		System.out.println(sb3);
	
	//코리아 뒤에 사랑을 넣고싶음
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"사랑"); //코리아 길이를 확인하고 끝을 확인.
		System.out.println(sb3);
		
	//대한민국을 지우고싶음
	//delete(s,e) : s인덱스에서 e-1 인덱스까지 삭제
		sb3.delete(sb3.indexOf("대한민국"),sb3.indexOf("대한민국")+"대한민국".length() );
		System.out.println(sb3);
	
	//다지우고싶음
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println("길이 : "+sb3.length()+",버퍼크기"+sb3.capacity());
		
	//버퍼의 크기를 문자열길이로
		sb3.trimToSize();
		System.out.println("길이 : "+sb3.length()+",버퍼크기"+sb3.capacity());
	
		System.out.println("sb1= "+sb1);
		
	//모든 문자열 지우기
		sb1.delete(0, sb1.length());
		System.out.println("문자열 : "+sb1);
	
	//모든 문자열 지우기
		System.out.println("sb2= "+sb2);	
		sb2=new StringBuffer();
		System.out.println("다시 new 한 경우 : "+sb2);
	}
}
