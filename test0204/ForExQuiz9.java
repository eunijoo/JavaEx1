package test0204;

public class ForExQuiz9 {
//1~10������ ������ ���� ����ϴ� ���α׷� //���ѷ���&break �̿��ؼ�
	public static void main(String[] args) {
		
		int n,s; //n:��������, s:�հ躯��
		n=s=0; //1���ʹϱ� 0���� �ʱ�ȭ
		for(;;) { //���ѷ���
			n++; //1�� ����
			s+=n; //n�� ���� s�� ����
			if(n>=10) { //n�� 10�� ���ų� ũ�� break�� ���ѷ��� ��������
				break;
			}
		}
		System.out.println("1~10 ��: "+s);
	}
}


