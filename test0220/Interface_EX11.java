package test0220;

public class Interface_EX11 {

	public static void main(String[] args) {
		//Demo11 ob=new Demo11(); //컴오류 .인터페이스는 객체생성 불가.
		
		//익명클래스 :Interface_EX11$1.class 로 클래스가 생성
		Demo11 ob=new Demo11() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("익명 클래스로 구현됨...");
			}
		};//1회용//1회용 클래스
		ob.print();
	}	
}
//익명 : 클래스는 필요한데 이름이 없음.
//데모 11에 대한 클래스는 있는데 한번쓰고 땡치는 클래스 
interface Demo11{
	public void print();
}