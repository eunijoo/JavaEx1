package test0204;

//�Ǻ���ġ���� 1+1+2+3+5+8+13+21���� ���ϴ� ���α׷�.
//�Ǻ���ġ����=�տ� �� ���� ���� �ڱ��ڽ��� ���� ����°�  ex)(1+1)=2 (1+2)=3 (2+3)=5
public class WhileQuize9 {

	public static void main(String[] args) {
		int a=1, b=1,c;
		int s,n;
		
		n=2;
		s=2;
		while(n<8) {
		//System.out.println("������"+a+","+"���� �μ� ���Ѱ�"+b); //��� �����ϴ��� ���.
			c=a+b;
			s+=c;
			a=b;
			b=c;
			n++;
		}
		System.out.println("���:"+s);
	}
}


