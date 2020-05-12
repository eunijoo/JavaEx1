package test0220;

public class Interface_EX6 {
	public static void packing(Fruit f) {
							//인터페이스가 없으면 (Fruit f) 대신  (Apple f)이나 (Orange f)라고 각각 만들어줘야함.
							//packing는 interface한테 의존관계를 갖고있다.
		System.out.println(f.getName()+ ":"+ f.getPrice());
	}
	
	public static void main(String[] args) {
		Apple a=new Apple();  //사과얼마니?
		packing(a);
		
		Orange o=new Orange(); //오렌지 얼마니?
		packing(o);
	}
}
//어떤메소드가 필요한지 선언만해준다.
interface Fruit{  //자식이 2개있다(사과,오렌지)
	public int getPrice();  // 얼마인지
	public String getName(); //누가얼마인지
}

//사과 틀 구현해주는 클래스
class Apple implements Fruit{

	@Override
	public int getPrice() {		
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
}
//오렌지 틀 구현해주는 클래스
class Orange implements Fruit {

	@Override
	public int getPrice() {		
		return 500;
	}

	@Override
	public String getName() {	
		return "오렌지";
	}
	
	
}
