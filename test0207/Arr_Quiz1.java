package test0207;

import java.util.Scanner;

public class Arr_Quiz1 {
//년도를 입력받아 입력받은 년도의 띠를 구하는 프로그램
//입력받은 년도가 1990보다 적으면 다시 입력받는다.
//띠는 배열을 이용하여 구한다.
//쥐,소,범,토끼,용,뱀,말,양,원숭이.닭,개,돼지	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//초기값은 12로 나눠지는 년도부터 시작해야함
		String []ani = {"원숭이","닭","개","돼지","쥐","소","토끼","용","뱀","말","양"};
		int y;
		
		//년도 입력받는다.
		do {
		System.out.println("년도?");
		y=sc.nextInt();//년도 입력
		}while(y<1900); //1900보다 적으면 다시 입력
		
		//출력한다/		
		System.out.printf("%d년도는 %s의 해입니다.",y,ani[y%12]);
		//ani[y%12]원숭이를 시작으로 나머지값이 배열방에 간다.
		
		sc.close();
	}

}
