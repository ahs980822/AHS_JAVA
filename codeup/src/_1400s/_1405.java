package _1400s;

import java.util.Scanner;

public class _1405 {
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
		
		
		// j - 시작 	: i
		// j - 종료 	: length + i -1
		// j		: 2 3 4 5 6
		// index 	: 2 3 4 0 1	
		
		
		// 12345 출력
		// i : 0 1 2 3 4
		/*
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i%N] + " ");
		}
		System.out.println();
		
		// 23451 출력
		// i : 1 2 3 4 0
		// 1 % 5 = 1
		// 2 % 5 = 2
		// 3 % 5 = 3
		// 4 % 5 = 4
		// 5 % 5 = 0
		for (int i = 1; i < input.length + 1; i++) {
			System.out.print(input[i%N] + " ");
		}
		System.out.println();
		
		// 34512 출력
		for (int i = 2; i < input.length + 2; i++) {
			System.out.print(input[i%N] + " ");
		}
		System.out.println();
		
		for (int i =3; i < input.length +3; i++) {
			System.out.print(input[i%N]+ " ");
		}
		System.out.println();
		
		for (int i =4; i< input.length +4; i++) {
			System.out.print(input[i%N]+ " ");
		}
		System.out.println();
		*/
				
		
		
			//index[4]까지 출력
			//1.index[0]부터 시작해서 length 만큼 
			//2.index[1]부터 시작해서 length 만큼
			//3.index[2]부터 시작해서 length 만큼
			//(index[n]; n<input.negth; i++)
	}

}
