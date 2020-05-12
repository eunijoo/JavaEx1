package test0207;

public class 문제 {
	public static void main(String[] args) {
		// 1부터 20까지의 숫자를 6개로 나열해서  1등~ 5등 추첨 
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
			System.out.print(i+"등 :");
			for (int s : n) {
				System.out.printf(" %2d ",s);		
		}
		System.out.println();

		}
		
	}
}
