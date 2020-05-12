package test0203;


public class WhileEx10 {
	public static void main(String[] args) {
	 int n,s;
	 
	 n=0;
	 s=0;
	 
	 while(n++<10) {  //1~10까지 true
	//	 System.out.println("결과: "+n);
		 s+=n;
	 }
	 System.out.println("결과: "+s);//1~10까지 합 :55
	}
}
