package test0221;

//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_Throws_Ex12 {
	
	public static void main(String[] args) {// main�� javaVM�� �θ� // ���ܸ� ȣ���Ѿ����� ���ѱ�ڴ�.

		User12 ob = new User12();

		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}
}

//�߸� �ۼ��� ���. 
class User12 {
	private int value;

	public void setValue(int value) { // throws Exception { // �޼ҵ带 ȣ���ϴ� ������ ���ܸ� catch�ϵ��� ����
		try {
		if (value < 0) {
			throw new Exception("0�̻� �����մϴ�."); // ������ checked ���ܸ� �߻�(������ ����Ŵ)(Exception ���ܹ߻�)
		}		
		this.value = value;
	}catch(Exception e) { //throw new Exception("") �� ���� catch��
		//���ܸ� �̰����� catch�ؼ� �޼ҵ带  ȣ���� �������� ���ܸ� ���� �� ����.
		//�߸� �ۼ��� �ڵ尡 �� �� �ִ�.
		System.out.println(e.toString());
	}
	}

	public int getValue() {
		return value;
	}
}
