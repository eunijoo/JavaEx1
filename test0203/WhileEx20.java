package test0203;

public class WhileEx20 {
	public static void main(String[] args) {
	//1~100���� ���� ����ϵ� ���� 10�ǹ���� �� ������ �� ���
	//1~10:55
	//1~20 : 210
	//	:
	//1~100:5050
		
	 int s,n;
	 
	 s=0;
	 n=0;
	 
	 while(n<100) {
		 n++;
		 s+=n;
		
		 if(n%10==0) {
			 System.out.println("1~"+n+"������ :"+s);
		 }		 
	  }	 
	}
}
