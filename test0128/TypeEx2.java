package test0128;

public class TypeEx2 {
	public static void main(String[] args) {
		byte a,b,c; //-128 ~ 127
		
		a=25;
		b='A'; //''�ȿ� �ִ� 'A'~'Z': 65~90 , 'a'~'z': 97~122 , alt+65=A , alt+97=a
		System.out.println(a+","+b); //25,65
		
	  //c=a+b; //����. +����� int���̹Ƿ� int�� byte�� ���ԺҰ�(int(4byte)�� byte(1byte)���� ũ�� ����x)
		c=(byte)(a+b); // int���� byte������ ���� ��ȯ�Ͽ�����
		System.out.println(c); //90
		
	  //c=200; //�����Ͽ���.byte�������� ���
	    c=(byte)200;
		System.out.println(c); //-56 -> �ٽ� 200���� ������ ����->�������� ���ļ� �߸�����,��ȣ�� �ٲ���� ��.
		
		
		
		
		
	
	}

}
