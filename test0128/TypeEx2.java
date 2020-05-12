package test0128;

public class TypeEx2 {
	public static void main(String[] args) {
		byte a,b,c; //-128 ~ 127
		
		a=25;
		b='A'; //''안에 있는 'A'~'Z': 65~90 , 'a'~'z': 97~122 , alt+65=A , alt+97=a
		System.out.println(a+","+b); //25,65
		
	  //c=a+b; //오류. +결과는 int형이므로 int는 byte에 대입불가(int(4byte)가 byte(1byte)보다 크서 대입x)
		c=(byte)(a+b); // int형을 byte형으로 강제 변환하여대입
		System.out.println(c); //90
		
	  //c=200; //컴파일오류.byte범위값을 벗어남
	    c=(byte)200;
		System.out.println(c); //-56 -> 다시 200으로 만들지 못함->범위보다 넘쳐서 잘린건지,부호가 바뀐건지 모름.
		
		
		
		
		
	
	}

}
