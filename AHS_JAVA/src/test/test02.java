package test;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 :  ");
		
		int input = sc.nextInt();
		int money = 50000;
		int cnt = 0;
		int sw = 0;

	
		while( money >= 1 ) {
			
			// 1. 화폐매수 계산
			cnt = input / money;							
			System.out.println(money + "원\t : " + cnt + "매");
			
			// 2. 잔액 계산
			// input = input - ( money*cnt );
			input = input % money;
			
			// 3. 화폐단위 변환
			if( sw == 0 ) {
				money = money / 5;
				sw = 1;
			}
			else {
				money = money / 2;
				sw = 0;
			}
			
		}
		
		
		
		
	}
	

}
