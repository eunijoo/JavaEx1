package test0220;

public class Interface_Default_EX10 {

	public static void main(String[] args) {
		Demo10 ob =new User10();
		ob.write();
		System.out.println(Demo10.sum(100));

	}	
}
//JDK8.0 이상 : static 메소드, ,default 메소드
interface Demo10{
	public void write();
	
	public static int sum(int n) {
		int s=0;
		for(int i=1; i<=n;i++) {
			s+=i;
		}
		return s;
	}
	
	//default 메소드는 구현클래스에서 재정의 가능
	//default 메소드에서는 구현 가능. 즉 default 메소드가 아니면 구현 불가.
	public default int max(int m, int n) {
		return m>n ? m: n;
	}
}

class User10 implements Demo10{

	@Override
	public void write() {
		System.out.println("write");
		
	}
	
}