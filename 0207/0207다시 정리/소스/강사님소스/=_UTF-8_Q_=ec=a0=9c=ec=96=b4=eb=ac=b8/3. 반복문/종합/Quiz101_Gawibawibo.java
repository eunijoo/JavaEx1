import java.util.Scanner;

public class Quiz101_Gawibawibo {
	public static void main(String[] args) {
/*
		���� ���� �� ���� ���α׷�
*/
		Scanner sc = new Scanner(System.in);
		int user, com;

        while(true){
			do{
			   System.out.print("1.���� 2.���� 3.�� 4.�������� => ");
			   user = sc.nextInt();
			}while(user<1||user>4);

			if(user==4)
				break;

			com = (int)(Math.random()*3)+1; // 1~3���� �߻�
            System.out.println("��� : "+(user==1?"����":user==2?"����":"��"));
            System.out.println("��ǻ�� : "+(com==1?"����":com==2?"����":"��"));

            if(user==com){
                System.out.println("�����ϴ�.\n");    
            } else if(((user==1)&&(com==3))||((user==2)&&(com==1))||((user==3)&&(com==2))){
                System.out.println("����� �̰���ϴ�.\n");
            } else {
				System.out.println("����� �����ϴ�.\n");
			}
        }
        
        sc.close();
	}
}
