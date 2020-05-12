package test0207;

public class ArrayEx7 {
//1~10까지 난수를 한줄에 10개씩 출력하고, 마지막에 각 숫자의 발생횟수 출력.
//(int)(Math.random()*10)+1
	public static void main(String[] args) {
		
		int []count=new int[10]; //10개 배열만듬 //count 갯수세는 변수
		int num; //랜덤 수 저장
		
		System.out.println("발생된 난수,,");
		for(int i=1; i<=100;i++) {
			num=(int)(Math.random()*10)+1;
			count[num-1]++;  //
			System.out.printf("%3d",num);
			if(i%10==0) System.out.println();
		}
		System.out.println("\n숫자별 발생횟수 : ");
		for(int i=0;i<count.length;i++) {
			System.out.println((i+1)+"\t"+count[i]);
			}
	}

}
