package test0210;
//5*4  행렬에 1~100까지의 난수를 발생하여 대입 후 출력하고,
//5*4행렬을 4*5행렬로 변환하여 출력하는 프로그램
public class Array_Array_EXQuiz4 {
	public static void main(String[] args) {
		int [][] a=new int[5][4];   //5행4열
		int [][] b=new int[4][5];   //4행5열
	
		//5*4
		for(int i=0;i<a.length;i++) {     //4열
		for(int j=0;j<a[i].length;j++) {  //5행 
				a[i][j]=(int)(Math.random()*100)+1;   //i:열이니깐 뒤에 , j:행이니까 앞에
			}
		}
		
		//4*5
		for(int i=0;i<b.length;i++) {     //5열
			for(int j=0;j<b[i].length;j++) {  //4행 
					b[i][j]=a[j][i];  //b행렬은 a의 행렬을 열행으로 변환해라.
			}
		}
		
		//a출력
		System.out.println("a배열 ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%5d",a[i][j]);			
			}
			System.out.println();
		}
		
		//b출력
		System.out.println("b배열 ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.printf("%5d",b[i][j]);			
			}
			System.out.println();
		}
	}
}
		
		
