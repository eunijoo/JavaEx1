package test0224;

public class Jenerics_ver1_Ex2 {
	public static void main(String[] args) {
		User2 ob=new User2();
		String s;
		
		ob.set("korea");
		System.out.println(ob.get());
		s= (String)ob.get(); //�ٿ�ĳ������ �ż� ������ ���� ��Ʈ��,��Ƽ�� �� �����ִ�.
		System.out.println(s.length());
		
		ob.set(new Integer(20));  //�ٿ�ĳ������ �ȵ�
		System.out.println(ob.get());
	//	s= (String)ob.get();  //��Ÿ�ӿ���. ��Ƽ��20�� ���ڿ��� ���ٲ�
	}
}

class User2{
	private Object data;
		
	public void set(Object t) {
		data =t;
	}
	
	public Object get() {
		return data;
	}
	
	
}
