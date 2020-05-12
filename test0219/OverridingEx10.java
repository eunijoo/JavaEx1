 package test0219;

public class OverridingEx10 {
	public static void main(String[] args) {
		
		Object ob1=new String("서울"); //업캐스팅
		Object ob2=new String("서울"); //업캐스팅
	//ob1의 문자열 길이알고싶음
		//System.out.println("길이: "+ob1.length()); //컴오류 => 업캐스팅돼서 다시 다운캐스팅해줘야 가능
		System.out.println(((String)ob1).length());
		
		System.out.println(ob1.equals(ob2)); //값비교. 메소드가 오버라이딩되어있음(아버지가 숨음)
		
		
		
		
	}
}

