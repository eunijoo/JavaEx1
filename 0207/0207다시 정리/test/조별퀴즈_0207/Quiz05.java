package tset0207;

public class Quiz05 {
	public static void main(String[] args) {
	
	// 12870���� 5000��, 1000��,500��,100��,50��,10��¥���� �����ϱ� ����
	// �ʿ��� ������ ����
		
	int s = 12870;
	int []a = new int[] {5000,1000,500,100,50,10};
	
	System.out.println("�ݾ� :"+s);
	
	int x;
	for(int n : a) {
		x=s/n;
		System.out.println(n+":"+x);
		s%=n;
   } 
}
}