package test0220;

public class Interface_Default_EX10 {

	public static void main(String[] args) {
		Demo10 ob =new User10();
		ob.write();
		System.out.println(Demo10.sum(100));

	}	
}
//JDK8.0 �̻� : static �޼ҵ�, ,default �޼ҵ�
interface Demo10{
	public void write();
	
	public static int sum(int n) {
		int s=0;
		for(int i=1; i<=n;i++) {
			s+=i;
		}
		return s;
	}
	
	//default �޼ҵ�� ����Ŭ�������� ������ ����
	//default �޼ҵ忡���� ���� ����. �� default �޼ҵ尡 �ƴϸ� ���� �Ұ�.
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