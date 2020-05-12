package test0205;

public class For_UpQuiz2 {
//방정식  3x+6y=27의 모든해를 구하는 프로그램
//단,x와 y는 정수, 각각의 범위는 0<=x<=10 , 0<=y<=10 
public static void main(String[] args) {
		for(int x=0; x<=10; x++) { //11번 반복
			for(int y=0; y<=10; y++) { //11번 반복 
				if(3*x+6*y==27) {  //3x+6y로 쓰면 안된다. 곱셈을 안붙여주면 곱셈인식 못함
					System.out.println("["+x+","+y+"]");
				}
			}
		}
	}
}


