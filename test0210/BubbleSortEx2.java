package test0210;
//버블정렬 : 가장 큰 수를 맨뒤로 정렬
//		   숫자가 이동하면서 비교함.
public class BubbleSortEx2 {

	public static void main(String[] args) {
		int []num =new int[] {20,30,25,62,50,45,60,65,70};
		boolean flag;
		int pass,temp;
		
		System.out.print("source data : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		pass=1;
		do {  //무조건 한번은 반복해야해서 do-while문 써야한다.
			flag = false;
			for(int i=0;i<num.length-pass;i++) {
				if(num[i]>num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					flag=true;
				}
			}
			System.out.print(pass+"회전 : ");
			for(int n : num) {
				System.out.print(n+" ");
			}
			System.out.println();
			pass++;
		}while(flag);
		
		System.out.print("source data : ");
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}

