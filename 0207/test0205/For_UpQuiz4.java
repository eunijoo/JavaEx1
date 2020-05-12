package test0205;

public class For_UpQuiz4 {
//[ 1-2+3-4+5-...+9-10 = 결과 ]출력프로그램
public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				s+=i;  //홀수는 +
				System.out.print(i+"-");
			}else {
				s-=i;//나머지는 +
				System.out.print(i+(i==10? " = " : "+")); //마지막에 또 +나오는 거 방지로 삼항식 사용
			}
		}
		System.out.println(s);
	}
}


