package test;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// N을 입력
		int N = sc.nextInt();
		// N개의 배열요소를 갖는 배열생성
		int input [] = new int[N];
		
		// N개의 데이터를 배열에 입력
		for (int i = 0; i <input.length; i++ ) {
			input[i]=sc.nextInt();
		}

		
		// j : 0 1 2 3 4 / i : 0
		// j : 1 2 3 4 0 / i : 1
		// j : 2 3 4 0 1 / i : 2
		// j : 3 4 0 1 2 / i : 3
		// j : 4 0 1 2 3 / i : 4
		// N줄을 출력
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length + i; j++) {
				System.out.print( input[j%N] + " ");
			}
			System.out.println();
		}
		
		
	}

}


