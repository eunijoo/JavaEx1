package test0210;
//선택정렬 : 가장 작은 수를 맨 앞으로 가져오는 정렬방법
//		     순서대로 숫자를 하나하나 비교
public class SelectionSortEx1 {

	public static void main(String[] args) {
		int []num = new int[] {35,40,23,50,15};
		int temp;
		
		System.out.println("source data : ");  //선택정렬되기 전 배열값 출력 
		for(int n : num) {  //향상된 for문
			System.out.print(n+" ");
		}
		System.out.println();
/*		
1회전(0)=>0:1,0:2,0:3,0:4
2회전(1)=>1:2,1:3,1:4
3회전(2)=>2:3,2:4
4회전(3)=>3:4
*/
		for(int i=0;i<num.length-1; i++) { //(회전)데이터가 5개면 4번 반복  //변수 i:비교하는 숫자(앞숫자)
			for(int j=i+1;j<num.length;j++) {//j변수:비교당하는 숫자(뒷숫자)
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("source data : "); //선택정렬 후 배열값 출력
		for(int n : num) {
			System.out.print(n+" ");
		}	
	}

}
