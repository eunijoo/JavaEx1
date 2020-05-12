package test0224;

public class Jenerics_Non_Ex1 {
	public static void main(String[] args) {

		Object[] t = new Object[3];

		t[0] = new Integer(100);
		t[1] = new Integer(20);
		t[2] = new String("korea");

		//Arrays.sort(t); //런타임오류(ClassCastException)
			
		for (Object o : t) {
			//String s=(String)o;  //런타임오류(ClassCastException)인티져는 스트링으로 형변환 안됨. 
			//System.out.println(s.length());
			
//if문은 잘 안쓰는게 더 좋음. 이런식으로 코딩한거는 잘 못한 코딩.			
			if(o instanceof String) {  //instanceof : 문자열인지 검사해줌.
				String s=(String)o;
				System.out.println(s+":"+s.length());  
			}else if(o instanceof Integer) {
				Integer s=(Integer)0;
				System.out.println("정수 : "+s);
			}
			System.out.println(o);
		}
	}
}
