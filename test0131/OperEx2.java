package test0131;

public class OperEx2 {

	public static void main(String[] args) {
		int a;
		a=(+-+-+-((5%3)*(4/2))); //(+-+-+-(4)) // 음수가 2번이면 양수,3번이면 음수
		System.out.println(a); //-4
		
		int x=2, y=5, z=0;
		x+=3+2; // x += 5
		System.out.println(x+","+y+","+z); //7,5,0
		
		x+=y-=z=4; //우변을 먼저 계산 후,좌변으로
		//z=4;
		//y-=z; // 1
		//x+=y; //8	
		System.out.println(x+","+y+","+z); //8,1,4

	}

}
