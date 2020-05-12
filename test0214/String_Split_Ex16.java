package test0214;

public class String_Split_Ex16{
	public static void main(String[] args) {
	//인코딩값:MS949
		System.out.println("디폴트캐릭터셋 : "+System.getProperty("file.encoding")); //MS949
		
		try {
			byte[] b;
			String s="대한민국";
			
		//MS949
			b=s.getBytes(); //MS949 코드값을 가져옴
			System.out.println("MS949 길이: "+b.length+"byte");
			for(byte a:b) {
				System.out.println(a+" ");
			}
			System.out.println();
			System.out.println("=======================");
	
		//UTF-8로 바꾸꼬싶음
			b=s.getBytes("utf-8"); // UTF-8
			System.out.println("utf-8 길이: "+b.length+"byte");
			for(byte a:b) {
				System.out.println(a+" ");
			}
			System.out.println();
			System.out.println("=======================");
		}catch (Exception e) {			
		}
	}
}
