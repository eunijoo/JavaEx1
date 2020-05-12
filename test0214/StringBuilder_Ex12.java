package test0214;

public class StringBuilder_Ex12 {
	public static void stringBufferTime() {
		long start=System.currentTimeMillis();
//스트링 버퍼 클래스	
		StringBuffer sb=new StringBuffer("a");
		for(int i=1; i<100000;i++) {
			sb.append("a");
		}
		
		long end=System.currentTimeMillis(); //시간을 구하는것
		
		System.out.println("StringBuffer 클래스...");
		System.out.println("문자열길이"+sb.length());
		System.out.println("실행시간:"+(end-start)+"ms");
				
	}
//스트링 빌더 클래스
	public static void stringBuilderTime() {
		long start=System.currentTimeMillis();
		
		StringBuilder bu=new StringBuilder("a");
		for(int i=1; i<100000;i++) {
			bu.append("a");
		}
		
		long end=System.currentTimeMillis(); //시간을 구하는것
		
		System.out.println("StringBuilder 클래스...");
		System.out.println("문자열길이"+bu.length());
		System.out.println("실행시간:"+(end-start)+"ms");
		
	}
//스트링 클래스
	public static void stringTime() {
		long start=System.currentTimeMillis(); //시간을 구하는것
		String s="a";
		for(int i=1; i<100000;i++) {
			s+="a";
		}
		long end=System.currentTimeMillis(); //시간을 구하는것
		
		System.out.println("String 클래스...");
		System.out.println("문자열길이"+s.length());
		System.out.println("실행시간:"+(end-start)+"ms");
				
		
	}
	
	public static void main(String[] ss) {
		stringBufferTime();
		System.out.println("------------------------");
		stringBuilderTime();
		System.out.println("------------------------");
		stringTime();
	}
}
