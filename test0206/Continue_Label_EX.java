package test0206;

public class Continue_Label_EX {
//continue labelName;
public static void main(String[] args) {
/*		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) {
					continue; //for(int j=1;j<=3;j++) �������� �ö�.
				}
				System.out.println(i+","+j);//��� 1,1
											// 1,2
											// 2,1
											// 2,3
											// 3,2
											// 3,3
			}	
		}
*/
		AAA:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) {
					continue AAA; //for(int i=1;i<=3;i++) ������ i++�� ����.
				}
				System.out.println(i+","+j);//��� 1,1
											//	  1,2
											//	  2,1	
			}
		}	
	}
}