package _1400s;

import java.util.Scanner;

public class _1402 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int input[] = new int[N];		// 배열요소 N개인 배열생성
		
		// i : 0 부터 (N-1)까지 1씩 증가
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		// input[5] : 1 2 3 4 5
		//	index	: 0 1 2 3 4
		//  length	: 5
		// 	last	: length - 1
		// i : (N-1)부터 0까지 1씩 감소
		for (int i = input.length-1; i >= 0; i--) {
			System.out.print( input[i] + " " );
		}
	}
}
