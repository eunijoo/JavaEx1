package test0221;

//0�̻��϶��� ���α׷�����. 0�̸��� ������Ű��/.
public class Exception_RuntimeException_Ex14 {

	public static void main(String[] args) {// main�� javaVM�� �θ� // ���ܸ� ȣ���Ѿ����� ���ѱ�ڴ�.
		User14 ob=new User14();
		
		try {
		ob.set(-10);
		int n=ob.getAge();
		System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}

class User14{
	private int age;
	
//gettersetter�� �ڵ�ä��
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("���̴� 0�̻��̴�.");
	//		Exception e = new Exception("���̴� 0�̻��̴�."); //���ٰ� ������.
		}
		this.age = age;
	}
	public void set(int age) throws Exception {
		try {
			setAge(age);
		} catch (Exception e) {
		//	System.out.println(e.toString());
			throw e; //Exception��ü�� ����(���� ���ܸ� �ٽ� ������.)
		}
	}
	
}