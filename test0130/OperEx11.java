package test0130;

public class OperEx11 {

	public static void main(String[] args) {
		int x,y,z;
		boolean t;
		
		x=y=z=1;
		t= ((++x != 0) || (++y != 0) || (++z != 0)); // ||연산자는 좌측에서  true나오면 나머지 연산을 안함.(y,z안함)
		System.out.println(x+","+y+","+z+","+t); //2,1,1,true

		x=y=z=1;
		t= ((++x != 0) | (++y != 0) | (++z != 0));//비트연산자의 boolean이여서 x,y,z 모두 연산 됨
		System.out.println(x+","+y+","+z+","+t); //2,2,2,true
		
		x=y=z=-1;
		t= ((++x != 0) && (++y != 0) && (++z != 0));// &&연산자는 좌측에서 false나오면 나머지 연산을 안함.(y,z안함)
		System.out.println(x+","+y+","+z+","+t); //0,-1,-1,false

		x=y=z=-1;
		t= ((x++ != 0) && (++y != 0) && (++z != 0));// &&연산자는 좌측에서  false나오면 나머지 연산을 안함.(y,z안함)
		System.out.println(x+","+y+","+z+","+t); //0,0,-1,false
		
		x=y=z=-1;
		t= ((++x != 0) & (++y != 0) & (++z != 0));//비트연산자의 boolean이여서 x,y,z 모두 연산 됨
		System.out.println(x+","+y+","+z+","+t); //0,0,0,false
	}

}
