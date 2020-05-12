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
		while(st.hasMoreTokens()) {  //hasMoreTokens : 분류한것이 있으면
			x=st.nextToken();
			System.out.println(x+" ");
		}
		System.out.println();

	//구분자도 반환 받는다.(,)  //split쓰는게 더 편하다.
		StringTokenizer st2=new StringTokenizer(s,",",true);
		String x2;
		while(st2.hasMoreTokens()) {  //hasMoreTokens : 분류한것이 있으면
			x2=st2.nextToken();
			System.out.println(x2+" ");
		}
		System.out.println();
	}
}
