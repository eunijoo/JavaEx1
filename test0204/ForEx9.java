package test0204;

public class ForEx9 {

	public static void main(String[] args) {	
		int i;
		for(i=1;i<=10;i++) {
			System.out.println("안"+i);//1번반복
			i=10;//for문 안에서 반복문에 사용된 변수를 변경하면
				//반복횟수가 바뀐다.
		}
		System.out.println("밖:"+i);
 }
}