package test0204;

public class RandomEx {

	public static void main(String[] args) {
		int n;
//�����Ҷ����� �ٸ����� ��µ�(����)
//0 <= Math.random() < 1 ������ ����  //1���� ���� �Ǽ��� �����Ե�.		
		for(int i=1;i<=100 ; i++) {
			n=(int)(Math.random()*100)+1; //�Ǽ�*100 => �ּ� 0,�ִ�99 //+1�� ���༭ 1~100���� ��������.
			System.out.printf("%5d",n);
			if(i%10==0) {
				System.out.println();
			}
		}

	}
}
