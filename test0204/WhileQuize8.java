package test0204;

//1+2+4+7+11+...�� 20��° �ױ����� ���� ���ض�.(������ ���ؾ���)
public class WhileQuize8 {

	public static void main(String[] args) {
		int n,s,t;  //n�� 20��°���� ���ں���. s�� �� ����
					//t�� ���ڰ��� ���̰��� ��Ÿ���� ����
		
		n=0; s=0; //1���� �����̿��� 0���� �ʱ�ȭ
		t=1;   //���ڰ��� �ּҰ��� 1�̿��� 1�� �ʱ�ȭ
		while(n<5) {  //20���� ���ƶ�
			System.out.print("t:"+t+", ");
			s+=t;   // t���� ���� s������ ����
			System.out.println("s:"+s);
			n++;
			t+=n; //t�� ����������
		}
		System.out.println("���:"+s);
	}
}


