package _1400s;

import java.util.Scanner;

public class _1409 {
	//첫째 줄에 숫자 10개가 차례대로 입력된다.
	//둘째 줄에 k값이 입력된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input [] = new int[10]; //10개로고정
		
		for (int i=0; i<input.length; i++) {			
			input[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println(input[k-1]); //index는 0부터 시작이므로
		
	}

 

}
