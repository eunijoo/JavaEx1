package test0203;


public class WhileEx10 {
	public static void main(String[] args) {
	 int n,s;
	 
	 n=0;
	 s=0;
	 
	 while(n++<10) {  //1~10���� true
	//	 System.out.println("���: "+n);
		 s+=n;
	 }
	 System.out.println("���: "+s);//1~10���� �� :55
	}
}