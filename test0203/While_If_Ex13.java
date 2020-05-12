package test0203;


public class While_If_Ex13 {
	public static void main(String[] args) {
	 int n,s;
	 
	 n=0;
	 s=0;
	 
	 while(n<100) {  //1~100±îÁö true
		n++;
		if(n%2==1)
			s+=n;
	 }
	 System.out.println("È¦¼öÇÕ:"+s);
	}
}
