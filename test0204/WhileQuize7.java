package test0204;

//x는 100부터 시작해서 1초마다 2씩 증가.
//y는 0부터 시작해서 1초마다 5씩 증가.
//몇 초 후에 y가 x를 따라잡는지와 따라잡았을 때 x,y값을 구하는 프로그램.
public class WhileQuize7 {

	public static void main(String[] args) {
		int x,y,s;
		
		x=100; y=0; s=0;
		
		while(x>=y) { //y가 x보다 커져야하는데 y가 x를 지나치는 순간이 있어서 (>=)를 써야함.
			s++;  //1초씩 증가
			x+=2; //x는 2씩 증가
			y+=5; //y는 5씩 증가
		}
		System.out.println(s+","+x+","+y);
	}
}


