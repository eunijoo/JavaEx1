package test0213;

public class Method_Ex1 {
	public static void main(String[] args) {
		Test1 t=new Test1(); //��ü ����
		int x;
		x=t.sub2(10); // 1> t.sub2(10)����
						//4>t.sub2(10)�� ��ȯ�� ��(55)�� x�� ����
		System.out.println(x);
		System.out.println(t.sub2(100));
		//System.out.println(t.sub1(1)); //�Ŀ��� / /t.sub1(1)�� ���ƿ��� ���� ��� ����
		t.sub1(1);
		
		x=t.sub3(10);
		if(x==1)
			System.out.println("����.........");
		
		t.sub3(5); //����  �ǵ��� ���� �Ŀ�, ����
	}
}

class Test1{
//-------------------------------
//�޼ҵ�
	public void sub1(int n) { //�����ִ°� ����
		n+=10;
		System.out.println(n);
	}
//--------------------------------	
	public int sub2(int n) {
		//2>�ڵ����
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=1;
		}
		// 3>���(55)�� ��ȯ
		return s;
	}

	public int sub3(int n) {
		if(n<0)
			return 0;
		
		System.out.println(n);  //
		
		return 1;
	}
}