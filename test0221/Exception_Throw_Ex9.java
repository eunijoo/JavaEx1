package test0221;
//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_Throw_Ex9 {
	public static void main(String[] args) {

		User9 ob=new User9();
		ob.setValue(-3);
		int n =ob.getValue();
		System.out.println(n);
	}
}
//�߸� �ۼ��� ���. 
class User9{
	private int value;
	
	public void setValue(int value) {
		if(value<0) {
			return;
		}
		
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}