package test0210;
//버블정렬 : 가장 큰 수를 맨뒤로 정렬
//		   숫자가 이동하면서 비교함.
public class BubbleSortEx1 {

	public static void main(String[] args) {
		int []num = new int[] {35,40,23,50,15};
		int temp;
		
		System.out.println("source data : ");  //버블정렬되기 전 배열값 출력 
		for(int n : num) {  //향상된 for문
			System.out.print(n+" ");
		}
		System.out.println();
/*		
1회전(0)=>0:1,1:2,2:3,3:4
2회전(1)=>0:1,1:2,2:3
3회전(2)=>0:1,1:2
4회전(3)=>0:1
*/
		for(int i=1; i<num.length;i++) {     //(회전)데이터가 5개면 4번 반복  //변수 i:회전 횟수
			for(int j=0;j<num.length-1;j++) {  //j변수 : 비교해야하는 숫자
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("source data : "); //버블정렬 후 배열값 출력
		for(int n : num) {
			System.out.print(n+" ");
		}	
	}
}

