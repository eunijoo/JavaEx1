package test0206;

public class Break_Label_Ex {
//break labelName;
public static void main(String[] args) {
	
/*		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) {
					break;  //바로 위의 for문자으로 올라감.
				}
				System.out.println(i+","+j);	//출력  1,1
												//	  1,2
												//	  2,1
			}
		}

*/
		gogogo:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) {
					break gogogo;  //for(int i=1;i<=3;i++) 빠져나감
				}
				System.out.println(i+","+j);//출력 1,1
											//	  1,2
			}
		}
	}
}
