public class Ex001_break {
	public static void main(String[] args) {
/*
		�ݺ����� break���� �̿��� 1~100 ������ ���� ���ϴ� ���α׷�
*/
		int n, s;
		n=s=0;
		
		// break : while, do~while, for, switch~case ������ ���
		while(true) {  // ���ѷ���
			n++;
			s+=n;
			if(n>=100)
				break; // �ݺ��� �Ǵ� switch���� ��������
		}
		System.out.println("��� : "+s);
	}
}
