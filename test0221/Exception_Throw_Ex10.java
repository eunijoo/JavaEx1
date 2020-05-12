package test0221;

//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_Throw_Ex10 {
	public static void main(String[] args) {

		User10 ob = new User10();
		try {
			ob.setValue(-3);
			int n = ob.getValue();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------");
	}
}

//�߸� �ۼ��� ���. 
class User10 {
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