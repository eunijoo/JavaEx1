package test0131;

public class OperEx1 {

	public static void main(String[] args) {
		short a,b;
		/*
		 a+=b;  //byte,short,char 에서 형변환이 일어나지 않는다.
		 a=a+b; //byte,short,char 에서 int(정수)로 형변환일어난다.
		 
		 a-=b;
		 a=a-b;
		 
		 */
		
		//a+=b;// 컴파일 오류, 초기화가 되어있지 않아서
		
		a=10;
		b=5;
		//a=a+b; //int로 형변환이 일어나므로 오류발생
		a+=b; //위 식과 같은식이지만 형변환이 일어나지 않고,속도가 빠르다.(배정연산자)
		System.out.println(a);
		
		char c='A';
		c+=10;
		System.out.println(c); //'K'
		
		float f =3.5f;
		char ch = 'A';
		
		ch+=f;//65에 +3.5가 됨 68.5의 68이  char이 되어 'D'가 됨.
		System.out.println(ch); //'D' 
		
		f =3.5f;
		ch = 'A';
		f+=ch;
		System.out.println(f); //68.5
	}

}
