package test0204;

//1-2+3-4+...+9-10�� �������� ����ϴ� ���α׷� �ۼ�.
public class WhileQuize2 {

	public static void main(String[] args) {
		
		int n,s;
		n=s=0; //1���� ���������ϴϰ� 0���� �ʱⰪ�� ��
		while(n<9) {
			n++;
			s+=n; //Ȧ�� �϶� +
			n++;
			s-=n; //¦�� �϶� -
		}			
		System.out.println("��� :"+s);
	}
}


