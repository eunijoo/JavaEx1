
public class Ex006_Random {
	public static void main(String[] args) {
/*		
		1~10까지 난수를 100개를 발생하여 한줄에 10개씩 출력하고
		마지막에 각 숫자의 발생 횟수를 출력  하는 프로그램
*/
		int []count=new int[10];
		int num;
		
		System.out.println("발생된 난수...");
		for(int i=1; i<=100; i++) {
			num=(int)(Math.random()*10)+1;
			count[num-1]++;
			System.out.printf("%3d", num);
			if(i%10==0)
				System.out.println();
		}
		
		System.out.println("\n숫자별 발생 횟수...");
		for(int i=0; i<count.length; i++) {
			System.out.println((i+1)+"\t"+count[i]);
		}
	}
}
