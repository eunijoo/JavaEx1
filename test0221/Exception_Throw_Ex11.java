package test0221;

//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_Throw_Ex11 {
										//throws Exception : �޼ҵ带 ȣ���Ѱ����� ���ܸ� �ѱ�
	public static void main(String[] args) throws Exception{// main�� javaVM�� �θ� // ���ܸ� ȣ���Ѿ����� ���ѱ�ڴ�.

		User11 ob = new User11();

		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}
}

//�߸� �ۼ��� ���. 
class User11 {
	private int value;

	public void setValue(int value) throws Exception { // �޼ҵ带 ȣ���ϴ� ������ ���ܸ� catch�ϵ��� ����
		if (value < 0) {
			throw new Exception("0�̻� �����մϴ�."); // ������ checked ���ܸ� �߻�(������ ����Ŵ)(Exception ���ܹ߻�)

		}
		this.value = value;

	}

	public int getValue() {
		return value;
	}
}
