package test0204;

public class ForEx1 {

	public static void main(String[] args) {
		int n;
/*		
		for(n=1; n<=10 ; n++) {  // for(�ʱ�;����;������)
			System.out.println("��:"+n); //123...910
		}
		System.out.println("��:"+n); //11
*/
		n=1;
		for( ; n<=10 ;) {
			System.out.println("��:"+n); //123...910
			n++;  //����� �����ϳ� for�������� �̷��� �Ⱦ�.
		}
		System.out.println("��:"+n); //11
		}
	}


