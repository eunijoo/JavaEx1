package test0203;

public class WhileEx2 {

	public static void main(String[] args) {
		int n;
		n=0; // �ʱ�ȭ�� �ʿ�
		while(n<10) {
			n+=2;
			System.out.println("��:"+n); // 2 4 6 8 10 
		}
		System.out.println("��:"+n); // 10
	}
}
