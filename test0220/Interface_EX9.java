package test0220;

public class Interface_EX9 {

	public static void main(String[] args) {

	}	
}

interface ADemo9{
	public void write();
}

interface BDemo9{
	public void print();
	
}
//�������̽��� �ٸ� �������̽��� 2�� �̻� ��Ӱ���.
interface Demo9 extends ADemo9,BDemo9{
	public void sub();
}

class User9 implements Demo9{

	@Override
	public void write() {
		
		
	}

	@Override
	public void print() {
				
	}

	@Override
	public void sub() {
			
	}
}