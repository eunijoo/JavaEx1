package test0226;

import java.util.Stack;

//STACK :LIFO구조
public class Stack_Ex2 {
	public static void main(String[] args) {
	//Stack : Vector의 하위클래스
		Stack<String> st= new Stack<>();
		
	//스택에 데이터추가:push
	
		st.push("검정");
		st.push("노랑");
		st.push("녹색");
		st.push("청색");
		st.push("빨강");
	
		//스택 데이터 가져오기
		//pop() : top 요소 반환 후, 삭제
		//peek() : top 요소 반환 후, 삭제하지 않음.
		while(! st.empty()) {
			String s=st.pop(); //스택 top 요소 반환 후 삭제
			System.out.println(s+" ");
		}
		System.out.println();
	}
}
