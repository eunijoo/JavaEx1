public class Ex001_continue {
	public static void main(String[] args) {
/*
		�ݺ����� continue�� �̿��� 1~100 ������ Ȧ������ ���ϴ� ���α׷�
*/
		int n, s;
		n=s=0;
		
		// continue : while, do~while, for ������ ���
		while(n<100) {
			n++;
			if(n%2==0)
				continue;
			s+=n;
		}
		System.out.println("��� : "+s);
	}
}
