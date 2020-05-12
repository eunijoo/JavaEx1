package test0220;

public class Singleton_EX3 {
	public static void main(String[] args) {
		SingletonEx2 ob1= SingletonEx2.getInstance();
		SingletonEx2 ob2= SingletonEx2.getInstance();
		System.out.println(ob1==ob2);  //ture

	}
}

//������ �̱������� ����
class SingletonEx2{
	private SingletonEx2() {
		
	}
	//static ��øŬ����(class �ȿ� class)
	private static class Holder{
		public static final SingletonEx2 INST =new SingletonEx2();
	}
	
	public static SingletonEx2 getInstance() {
		return Holder.INST;
	}
}