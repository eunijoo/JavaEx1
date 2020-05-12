package test0213;

public class Method_Ex1 {
	public static void main(String[] args) {
		Test1 t=new Test1(); //객체 생성
		int x;
		x=t.sub2(10); // 1> t.sub2(10)실행
						//4>t.sub2(10)가 반환한 값(55)을 x에 저장
		System.out.println(x);
		System.out.println(t.sub2(100));
		//System.out.println(t.sub1(1)); //컴오류 / /t.sub1(1)로 돌아오는 값이 없어서 오류
		t.sub1(1);
		
		x=t.sub3(10);
		if(x==1)
			System.out.println("성공.........");
		
		t.sub3(5); //가능  되돌려 받은 후에, 버림
	}
}

class Test1{
//-------------------------------
//메소드
	public void sub1(int n) { //돌려주는게 없음
		n+=10;
		System.out.println(n);
	}
//--------------------------------	
	public int sub2(int n) {
		//2>코드실행
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=1;
		}
		// 3>결과(55)를 반환
		return s;
	}

	public int sub3(int n) {
		if(n<0)
			return 0;
		
		System.out.println(n);  //
		
		return 1;
	}
}