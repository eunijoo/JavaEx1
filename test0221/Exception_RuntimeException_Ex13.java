package test0221;

//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_RuntimeException_Ex13 {

	public static void main(String[] args) {// main�� javaVM�� �θ� // ���ܸ� ȣ���Ѿ����� ���ѱ�ڴ�.
		User13 uu = new User13();
		/*
		 * uu.setValue(-3); //value �� 0���� ��� RunTimeException ���ܹ߻� //����ó���� ���� �ʾ� ���α׷���
		 * �̰����� ���� int n=uu.getValue(); System.out.println(n);
		 * System.out.println("end..."); }
		 */
		
		try {
			uu.setValue(-3); // value �� 0���� ��� RunTimeException ���ܹ߻�
			// ����ó���� ���� �ʾ� ���α׷��� �̰����� ����
			int n = uu.getValue();
			System.out.println(n);

		} catch (Exception e) {
			System.out.println(e.toString()); 
		}
		System.out.println("end...");

	}
}
class User13 {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value < 0) {
			// RuntimeException: unchecked ���ܷ� �ݵ�� catch �� �ʿ����.
			throw new RuntimeException("0�̻� �����մϴ�.");
		}
		this.value = value;
	}

}