package test0218;

import java.util.Random;

public class Random_Class_EX21 {
	
		public static void main(String[] args) {
			int[]num;
			num=new int[6];
			Random rnd = new Random();
			for(int i=0;i<6;i++) {
				num[i]=rnd.nextInt(45)+1;
				for(int j=0; j<i;j++) {
					if(num[i]==num[j]) {
						i--;
						break;
					}
				}
			}
			
	}
}