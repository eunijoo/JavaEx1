package test0214;

//import java.util.Arrays;

public class Api_String_ArrayBubbleSort_Ex9 {
	public static void print(String[] ss) {
		for(String s:ss) {
			System.out.println(s+"  ");
		}
		System.out.println();
}
	
	public static void sort(String[] ss) {
		int pass;
		boolean flag;
		String temp;
		
	//bubble sort	
		pass=1;
		do { 
			flag=true;
			for(int i=0;i<ss.length-pass;i++) {
			//	if(ss[i].compareTo(ss[i+1])>0){ //��������
				if(ss[i].compareTo(ss[i+1])<0){  	//��������
					temp=ss[i];
					ss[i]=ss[i+1];
					ss[i+1]=temp;
					flag=true;
				}
			}
		}while(flag);
	}
	
	public static void main(String[] args) {
		
		String[] ss= {"����","�λ�","�뱸","��õ","����","����"};
		
		System.out.println("sort �� : ");
		print(ss);
		
		sort(ss);
		
		System.out.println("sort �� : ");
		print(ss);
	}
}
