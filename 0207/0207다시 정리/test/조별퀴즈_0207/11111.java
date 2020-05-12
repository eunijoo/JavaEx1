
package test0207;

 

public class aa2 {

	

	public static void main(String[] args) {

		//100까지 난수 평균  구하기

		

		int []a = new int[100];

		int sum = 0;

		

		for(int i=0; i<a.length; i++) {

			a[i] = (int)(Math.random()*100)+1;

			sum+=a[i];

		}

			/*for(int i=0; i<100; i++) {

				sum+=a[i];

			}*/

		

		System.out.println(sum/100);

		

		

	}

}
