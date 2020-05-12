package test0210;
//5행 5열의 배열에 1~25까지의 수를 실행 결과처럼 달팽이 모양으로 채워 출력하는 프로그램 작성.
//2차원 달팽이(2개의 for, if~else if문)
//9번 회전해야함
public class Array_Array_Quiz7 {
	
	public static void main(String[] args) {

		int num=5;   //
		int arr[][] = new int[num][num];
		int n=0, r=0, c=-1;

		for(int i = 1; i <= num*2-1; i++) {  //회전수 총 9번 회전이됨.
			for(int j = 0; j < num-(i/2); j++) {
				n++;
				if(i%4==1) // 좌->우
					arr[r][++c]=n;  //좌표로 봤을때 (r,c) => 좌->우일때는 r값고정, c값 증가
				else if(i%4==2) // 위->아래
					arr[++r][c]=n;  //좌표로 봤을때 (r,c) => 위->아래일때는 r값 증가,c값고정
				else if(i%4==3) // 우->좌
					arr[r][--c]=n;  //좌표로 봤을때 (r,c) => 우->좌일때는 r값고정,c값 감소
				else // 아래->위
					arr[--r][c]=n;  //좌표로 봤을때 (r,c) => 아래->위일때는 r값감소,c값고정
			}
		}
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}	
	}
}

