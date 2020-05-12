package test0226;

//STACK :LIFO����
public class MyStackApp {
	public static void main(String[] args) {
		MyStack<Integer> ms =new MyStackImpl<>(10);
		ms.push(10);
		ms.push(20);
		ms.push(30);
		
		while(! ms.isEmpty()) {
			int a= ms.pop();
			System.out.println(a);
		}
	}
}

//�迭�� �̿��� ���ø����(LIFO)
interface MyStack<E>{
//����
//�޼ҵ常��	
	public E pop(); //top ������ �������� ����
	public E peek(); //top ������ ��ȯ(��������)
	public void push(E data); //������ ����
	public boolean isEmpty(); //����ִ��� Ȯ��
}

//���豸��
class MyStackImpl<E> implements MyStack<E>{
	private E[] elementData;
	private int top; 	//top�� ��ġ
	
	@SuppressWarnings("unchecked")
	public MyStackImpl(int size) {
		elementData =(E[])new Object[size]; //E : ���ʸ�
		top =0; //���� ������ ���� 
	}
	
	@Override
	public E pop() {  //���粨 �����ְ� �����ȴ�.
		if(isEmpty()) {
			throw new RuntimeException("stack empty");  //���̻� �� ���ϰ� ����	
				
		}
		E item = peek();
		elementData[--top]=null;
		
		return item;
	}
	
//������ġ�� �÷��ִ°�
	@Override
	public E peek() {
		if(isEmpty()) {
		throw new RuntimeException("stack empty");  //���̻� �� ���ϰ� ����	
		}
		return elementData[top-1]; //�ֻ���� �����͸� ��ȯ.
	}

	@Override
	public void push(E data) {
		if(top >= elementData.length) {
			throw new RuntimeException("stack full");  //���̻� �� ���ϰ� ����	
			
		}
		elementData[top++]=data;
	}
	
//������ ����ִ��� �Ⱥ���ִ��� Ȯ���ϴ� �κ�
	@Override
	public boolean isEmpty() { 	
		return top<=0; //0���� ������ true
	}
}