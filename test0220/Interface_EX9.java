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
//인터페이스는 다른 인터페이스를 2개 이상 상속가능.
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