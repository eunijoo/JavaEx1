package test0207;

public class ���� {
	public static void main(String[] args) {
		// 1���� 20������ ���ڸ� 6���� �����ؼ�  1��~ 5�� ��÷ 
		int[] n = new int[6];
		for(int i=1;i<=5;i++) {
			for (int a = 0; a < n.length; a++) {
				n[a] = (int) (Math.random() * 20) + 1;
				for (int b = 0; b < a; b++) {
					if (n[a] == n[b]) {
						a--;
						break;
					}
				}
			}
			System.out.print(i+"�� :");
			for (int s : n) {
				System.out.printf(" %2d ",s);		
		}
		System.out.println();

		}
		
	}
}
