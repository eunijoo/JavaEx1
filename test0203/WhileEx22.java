package test0203;

public class WhileEx22 {
	public static void main(String[] args) {
		// 1/2 + 2/3 +...+ 9/10 ���
		
		int n;
		double s; //int�� �ϸ� ���� 0�̵Ǽ� �Ǽ��� ��������.
		
		n=0;
		s=0;
		
		while(n<9) {
			n++;
			s +=(double)n/(n+1);
		}
		System.out.println("���:"+s);
		//System.out.printf("���: %.2f\n",s); //�Ҽ��� 2��°�ڸ�����
	}		
}
