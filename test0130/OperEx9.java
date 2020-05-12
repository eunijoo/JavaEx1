package test0130;

public class OperEx9 {

	public static void main(String[] args) {
		int a=13, b=20;
		int c;
		
		System.out.println(a%2==1); //true. È¦¼ö
		System.out.println(b%2==0); //true. Â¦¼ö

		c=a&1;
		System.out.println(c); //1 (È¦¼ö)
		//System.out.println(a&1==1); //¿¡·¯ (ºñÆ®´ÜÀ§ ¿¬»ê¿ì¼±¼øÀ§ == -> (>,<,&,|,)
		System.out.println((a&1)==1); //true.È¦¼ö
	
		c=b&1;
		System.out.println(c); //0 (Â¦¼ö)
		System.out.println((b&1)==0); //true.Â¦¼ö
			
	}

}
