package test0214;

public class String_Ex3 {
	public static void main(String[] args) {
		String s1="seoul"; //s2�� �����ּҰ���Ŵ
		String s2="seoul";//s1�� �����ּҰ���Ŵ
		
		System.out.println(s1==s2);  //true
		
		s1+="korea"; // String������ +�� ���ڿ� ����.  //���ڿ� ������ ����ӵ��� �������� �ǹ����� �Ⱦ�.

		//�ڹٿ��� ���ڿ��� �Һ��� ��Ģ(���� �����Ҽ�����)=> ���ڿ��� �߰��Ǵ°� �ƴ϶�. ���ο� �޸𸮸� �Ҵ�޾Ƽ� �����.
		System.out.println(s1==s2); //false   //s1�� ���ο� �޸𸮸� �Ҵ�޾Ƽ� �ּҰ� �޶���.
		System.out.println(s1);//seoulkorea
		System.out.println(s2);//seoul
		
		String_Ex3 ob=new String_Ex3();
		
		//String s=ob;//�Ŀ���
		
		String s="seoul"+ob; //"���ڿ�" + "��Ű����.Ŭ������@�ؽ��ڵ�"
		System.out.println(s);
		
	}
}
