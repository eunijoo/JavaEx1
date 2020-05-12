package test0214;

import java.util.StringTokenizer;

public class String_Split_Ex15{
	public static void main(String[] args) {
		String s="java,css,html";
		
		String[] ss=s.split(",");
		for(String a: ss) {
			System.out.println("split:"+a+" ");
		}
		System.out.println();
		
		
		StringTokenizer st=new StringTokenizer(s,",");
		String x;
		while(st.hasMoreTokens()) {  //hasMoreTokens : �з��Ѱ��� ������
			x=st.nextToken();
			System.out.println(x+" ");
		}
		System.out.println();

	//�����ڵ� ��ȯ �޴´�.(,)  //split���°� �� ���ϴ�.
		StringTokenizer st2=new StringTokenizer(s,",",true);
		String x2;
		while(st2.hasMoreTokens()) {  //hasMoreTokens : �з��Ѱ��� ������
			x2=st2.nextToken();
			System.out.println(x2+" ");
		}
		System.out.println();
	}
}
