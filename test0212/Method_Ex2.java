package test0212;

public class Method_Ex2 {
	public static void main(String[] args) {
		Test2 t=new Test2(); //������ �����������
		int score=80;
		String s;
		
		s=t.hak(score);  //score�� : 80
		System.out.println(s);
		
		short n=10; 
		int a;
		
		a=t.odd(n); //������ ���μ��� �޴� ���μ����� �ڷ����� ���ų� ���ƾ���.((int s)�� int>(short n)short���� ����)
		System.out.println(a);
		
	//	a=t.odd(10L);//�Ŀ���
		
		double d=t.odd(10);//�����ڷ������� �޴� �ڿ����� ũ�ų� ���ƾ��Ѵ�.
		System.out.println(d);
	}

}

class Test2{
	//����̾簡
	public String hak(int s) {
		//String h; //��ü(��������) //�ʱⰪ�� ���༭ �����Ⱚ
		String h=null; //�ʱ�ȭ�� �ƴµ� �ּҰ� ����	
		switch(s/10) { 
		case 10:
		case 9: h="��"; break;
		case 8: h="��"; break;
		case 7: h="��"; break;
		case 6: h="��"; break;
		default: h="��"; break;
		}
		
		return h; //��� ���� �ϳ��� ���ϰ���.
	}
	
	//Ȧ����
	public int odd(int n) {
		int s=0;
		for(int i=1;i<=n;i+=2) {
			s+=i;
		}
		return s;
	}
}
