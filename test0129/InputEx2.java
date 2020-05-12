package test0129;

import java.util.Scanner;
//ctrl + shift +o : 자동  inport

public class InputEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, tel;
		int age;

		System.out.print("이름?");
		name = sc.nextLine(); // 입력 중간에 공백 입력가능 //엔터까지 데이터로 받음
		System.out.print("나이?");
		age = sc.nextInt();
		sc.nextLine(); // 엔터를 버림 //엔터를 받아야 버릴수있음 //안버리면 전화번호에서 입력을 못받게됨
		System.out.print("전화?");
		tel = sc.nextLine();

		System.out.print(name + "," + age + "," + tel);
		sc.close();
	}

}
