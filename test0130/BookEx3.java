package test0130;

public class BookEx3 {

	public static void main(String[] args) {
		
	//전체적으로 이해가 잘 안감..(아침에 질문)	
		int hex=0xABCD;//int 선언
		int mask =0xF; //16진수 
		
		System.out.println("book128p"); //책예제 128p
		
		System.out.printf("hex=%X\n",hex);
		System.out.printf("%X\n",hex&mask);//D
		
		hex=hex>>4;
		System.out.printf("%X\n",hex&mask);//C
		
		hex=hex>>4;
		System.out.printf("%X\n",hex&mask);//B
		
		hex=hex>>4;
		System.out.printf("%X\n",hex&mask);//A

	}

}
