package test;

import java.util.Scanner;

public class teset01plus {
	public static void main(String[] args) {
		System.out.print("입력하세요:  ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num % 6 == 0) {
			System.out.println("2와 3의배수입니다");
		}
		else {
			if(num % 3 == 0) {
				System.out.println("3의 배수입니다");
			}
			else {
				if(num % 2 == 0)  {
					System.out.println("2와 3의배수입니다");
				} 
				else {
					System.out.println("2의배수와3의배수가아닙니다");
				}
			}
		}
	}
	

}
