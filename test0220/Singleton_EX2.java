package test0220;

public class Singleton_EX2 {
	public static void main(String[] args) {
	//	SingletonEx1 ob=new SingletonEx1(); //�����ڰ� private�� �ܺο��� �����Ұ�
		SingletonEx1 ob1=SingletonEx1.getInstance();
		SingletonEx1 ob2=SingletonEx1.getInstance();
	
		System.out.println(ob1==ob2);
		
		ob1.print();
	
	}
}
//Singleton: ��ü�� 1���� �����ϴ°�
class SingletonEx1{
	private static SingletonEx1 inst;
	
	private SingletonEx1() {
		
	}
	
	public static SingletonEx1 getInstance() {//getInstance():����ƽ�̶� ��ü������ ������� �θ����ִ�.
		if(inst==null) {
			inst=new SingletonEx1(); // ��ü1�� ����
		}
		return inst;
	}
	
	public void print() {
		System.out.println("Singleton ���Ͽ���1...");
	}
}