public class Ex004_Sosu {
	public static void main(String[] args) {
/*
		2~100���� ���� �Ҽ��� ���ٿ� 10���� ���
*/
		int cnt=0;
		
		jump:
		for(int n=2;n<=100;n++) {
			for(int i=2;i<=(n/2);i++) {
				if((n % i) == 0) {
					continue jump;
				}
			}
			System.out.printf("%3d", n);
			cnt++;
			if(cnt%10==0)
				System.out.println();
		}
	
	}
}
