package test0205;

public class For_UpQuiz6 {
//4~1000사이의 수 주 완전수를 찾아 출력하는프로그램.
//완전수 : 자신을 제외한 약수의 합이 같은 경우. ex> 6= 1+2+3
public static void main(String[] args) {
		int a,b,s; //a:4~1000까지 수의 변수 , b: 약수구하는 변수 , s:약수의 합구하는 변수
		
		for(a=4;a<=1000;a++) {  //4~1000까지 ;1씩증가
			s=0; //합은 0부터 시작이니깐 0으로 초기화
			for(b=1;b<a;b++) {  //1부터 나눠줘야하고,자기자신과 나누면안돼서 1<b<a ;1씩증가
			   if(a%b==0) s+=b;  //a랑 b가 나눠지면 약수. 약수들 합을 s에 저장
			}		
			if(a==s) //a와 약수 더한 값(s)가 같으면 출력
			  System.out.println(s);	   	
			}		
		}		
	}



