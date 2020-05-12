package test0224;

public class Jenerics_Array_Ex7 {
	public static void main(String[] args) {
		User7<Integer> ob = new User7<>();

		Integer[] a = { 10, 20, 30 };

		ob.set(a);

		Integer[] b = ob.get();

		for (int x : b) {
			System.out.println(x + " ");
		}
		System.out.println();
	}
}

class User7<T> {
	private T[] data;

	@SuppressWarnings("unchecked") // ��� ����.
	public User7() {
		data = (T[]) new Object[10]; // ���ʸ��� ����ȯ�� �ȵǴµ� ������Ʈ ĳ���ýÿ��� ����.(��� �ߴµ� ���� �̷��� ��������)
	}

	public void set(T[] data) {
		this.data = data;
	}

	public T[] get() {
		return data;
	}
}