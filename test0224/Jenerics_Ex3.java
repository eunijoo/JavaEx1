package test0224;

public class Jenerics_Ex3 {
	public static void main(String[] args) {
		User3<String> ob=new User3<>();  //ob��� ��ü�� �����Ҷ� T�� �ڷ����� �����ȴ�.
	//	User3<String> ob=new User3<String>();  //JDK1.7���� �̸��� �̷��� �ؾ��Ѵ�.
		ob.set("korea");
		System.out.println(ob.get());
		
	//	ob.set(new Integer(20));  //�����Ͽ���. 
		User3<Integer> ob2=new User3<>();
		ob2.set(new Integer(20));
		System.out.println(ob2.get());
		
	//���ʸ����� �Ϲ����� ������� ��ü�� �����ϸ� ��� �߻��ϸ�, 
	//���α׷� ����� �߸��� ����ȯ���� ��Ÿ�ӿ����� �߻� �� �� �����Ƿ� ob3ó�� ��ü�� �����ϸ� �ȵȴ�.			
		User3 ob3=new User3();
		ob3.set(new Integer(200));
		System.out.println(ob3.get());
		
		ob3.set(new String("Seoul"));
		System.out.println(ob3.get());
		
		
	}
}

class User3<T>{   //<T> : ���ʸ�. ����� �ڷ����� ����.  //T��ü(���ʸ�)�� ������Ʈ�� ó���Ѵ�/. 
					//< >�ȿ��� �ƹ����ڸ��ᵵ �Ǵµ� �빮�ڷ� ǥ��.
	private T data;
		
	public void set(T t) {
		System.out.println(t.getClass().getName()); //�ش�Ǵ� Ÿ�� �˼��ִ�.
		data =t;
	}
	
	public T get() {
		return data;
	}
}
