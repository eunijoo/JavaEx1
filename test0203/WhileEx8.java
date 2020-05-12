package test0203;


public class WhileEx8 {
	public static void main(String[] args) {
	 int n,s;
	 
	 n=0;
	 s=0;
	 
	 while(n<10) { //1~10까지 합
		 n++;
		 s+=n;
		 System.out.println(n+","+s);
	 }
	 System.out.println("결과: "+s);
	}
}
