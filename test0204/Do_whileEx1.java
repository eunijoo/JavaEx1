package test0204;
public class Do_whileEx1 {
	public static void main(String[] args) {
/*      //�ݺ� Ƚ�� Ȯ��
		int n=0;
		
		do {
			n++;
			System.out.println("��:"+n);
		}while(n<10);
		System.out.println("��:"+n);
*/	
/*		
		//1-10���� �հ�
		int n,s;
		n=s=0;
		
		do {
			n++;
			s+=n;
		}while(n<10);
		System.out.println("���"+s);
*/		
		int n=10;
		while(n<10) { //ó�� ������ �������� ������ �Ѻ��� �������� ����.
			n++;
			System.out.println("while ��:"+n);
		}
		System.out.println("while ��:"+n);
		
		n=10;
		do {  //��� �ѹ��� ����.
			n++;
			System.out.println("do~while ��:"+n);
		}
		while(n<10);
		System.out.println("do~while ��"+n);
		}
	}

