package test0205;

public class For_For_Ex1 {

	public static void main(String[] args) {
		//����for��
		for(int i=1;i<=3;i++) {
			System.out.println("i"+i); //3������
			for(int j=1;j<=2;j++) {  //3*2=6������
				System.out.println("i:"+i+","+"j"+j);
			}
			System.out.println("---------------------"); //3�� ����(for���ȿ� ������.
		}

	}

}
