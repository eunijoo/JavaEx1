package score3_0224;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Score ss= new ScoreImpl();  //Score�� �������̽����� new���� ����.
		int ch;

		try {
			while (true) {
				do {
					System.out.println("1.�Է� 2.��� 3.�й��˻� 4.�̸��˻� 5.���� 6.���� 7.����=>");
					ch=sc.nextInt();
				}while(ch<1||ch>7);
					
				if(ch==7);
				
				switch (ch) {
				case 1: ss.input(); break;
				case 2: ss.print(); break;
				case 3: ss.findByHak(); break;
				case 4: ss.findByName(); break;
				case 5: ss.updata(); break;
				case 6: ss.remove(); break;
				}
			}
			
		} finally {
			sc.close();
		}
	}

}
