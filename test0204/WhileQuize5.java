package test0204;

//1+2+3+...+n������ ���� 100�� �Ѵ� �ּ��� n�� �׶��� ���� ������ ���.
public class WhileQuize5 {

	public static void main(String[] args) {
		
		int n,s;
		n=s=0;
		
		while(s<=100) {  //100�� �ּ��̱⶧���� (<=)�� �����.
			n++;
			s+=n;
		//	System.out.println(n+","+s); //���� ��� �Ǵ��� ��µ�.
		}
		System.out.println(n+","+s);
	}
}


