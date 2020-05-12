package test0220;

public class Singleton_EX2 {
	public static void main(String[] args) {
	//	SingletonEx1 ob=new SingletonEx1(); //생성자가 private면 외부에서 생성불가
		SingletonEx1 ob1=SingletonEx1.getInstance();
		SingletonEx1 ob2=SingletonEx1.getInstance();
	
		System.out.println(ob1==ob2);
		
		ob1.print();
	
	}
}
//Singleton: 객체를 1개만 생성하는거
class SingletonEx1{
	private static SingletonEx1 inst;
	
	private SingletonEx1() {
		
	}
	
	public static SingletonEx1 getInstance() {//getInstance():스테틱이라서 객체생성과 상관없이 부를수있다.
		if(inst==null) {
			inst=new SingletonEx1(); // 객체1개 생성
		}
		return inst;
	}
	
	public void print() {
		System.out.println("Singleton 패턴예제1...");
	}
}