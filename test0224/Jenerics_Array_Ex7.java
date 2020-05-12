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

	@SuppressWarnings("unchecked") // 경고 무시.
	public User7() {
		data = (T[]) new Object[10]; // 제너릭은 형변환이 안되는데 오브젝트 캐스팅시에만 가능.(경고가 뜨는데 굳이 이렇게 하지마라)
	}

	public void set(T[] data) {
		this.data = data;
	}

	public T[] get() {
		return data;
	}
}