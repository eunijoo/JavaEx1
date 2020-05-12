package test0204;

public class RandomEx {

	public static void main(String[] args) {
		int n;
//실행할때마다 다른값이 출력됨(랜덤)
//0 <= Math.random() < 1 사이의 난수  //1보다 작은 실수가 나오게됨.		
		for(int i=1;i<=100 ; i++) {
			n=(int)(Math.random()*100)+1; //실수*100 => 최소 0,최대99 //+1을 해줘서 1~100사이 난수가됨.
			System.out.printf("%5d",n);
			if(i%10==0) {
				System.out.println();
			}
		}

	}
}
