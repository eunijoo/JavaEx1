package test0205;

public class RandomEx {

	public static void main(String[] args) {
		int n;
		
		// 0 <= Math.random() < 1 ������ ����
		
		for(int i=1; i<=100; i++) {
			n = (int)(Math.random()*100)+1; // 1~100���̳���
			System.out.printf("%5d", n);
			if(i%10==0)
				System.out.println();
		}
	}

}
