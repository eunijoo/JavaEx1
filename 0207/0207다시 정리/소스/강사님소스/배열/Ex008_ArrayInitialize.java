public class Ex008_ArrayInitialize {
	public static void main(String[] args) {
/*		
		1���� �迭 �ʱ�ȭ
		4380���� �����ϱ� ���� �ʿ��� 500��, 100��, 50��, 10��¥���� ������ ������ ���ϴ� ���α׷�
*/
		int []unit;
		unit = new int[] {500, 100, 50, 10};
		
		int money=4380;
		
		System.out.println("�ݾ� : " + money);
		System.out.println("����\t����");
		for(int n : unit) {
			System.out.println(n+"��\t"+(money/n));
			money %= n;
		}
	}
}
