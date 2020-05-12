package test0226;

//STACK :LIFO구조
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

//배열을 이용한 스택만들기(LIFO)
interface MyStack<E>{
//설계
//메소드만듦	
	public E pop(); //top 데이터 가져오고 삭제
	public E peek(); //top 데이터 반환(삭제안함)
	public void push(E data); //데이터 삽입
	public boolean isEmpty(); //비어있는지 확인
}

//설계구현
class MyStackImpl<E> implements MyStack<E>{
	private E[] elementData;
	private int top; 	//top의 위치
	
	@SuppressWarnings("unchecked")
	public MyStackImpl(int size) {
		elementData =(E[])new Object[size]; //E : 제너릭
		top =0; //현재 데이터 없음 
	}
	
	@Override
	public E pop() {  //현재꺼 돌려주고 삭제된다.
		if(isEmpty()) {
			throw new RuntimeException("stack empty");  //더이상 일 못하게 막음	
				
		}
		E item = peek();
		elementData[--top]=null;
		
		return item;
	}
	
//현재위치꺼 올려주는거
	@Override
	public E peek() {
		if(isEmpty()) {
		throw new RuntimeException("stack empty");  //더이상 일 못하게 막음	
		}
		return elementData[top-1]; //최상단의 데이터를 반환.
	}

	@Override
	public void push(E data) {
		if(top >= elementData.length) {
			throw new RuntimeException("stack full");  //더이상 일 못하게 막음	
			
		}
		elementData[top++]=data;
	}
	
//스택이 비어있는지 안비어있는지 확인하는 부분
	@Override
	public boolean isEmpty() { 	
		return top<=0; //0보다 작으면 true
	}
}