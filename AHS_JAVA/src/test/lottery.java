package test;

import java.util.Scanner;

public class lottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[7]; 	//배열생성
		int ju[] = new int[6];
		int num = 0; 				// 당첨번호와 일치한 개수
		boolean bonus = false;
		
		//1.로또 당첨 번호 입력
		//2.주희 번호 입력
		for (int i=0; i<lotto.length; i++){
			lotto[i]=sc.nextInt();
		} //입력을 받음
		for (int i=0; i<ju.length; i++) {
			ju[i]=sc.nextInt();
		} //입력을 받음
		
		//로또번호, 주희 번호 일치하는지,,
		//n 에 대한 식 ??
		for (int i = 0; i < ju.length; i++) {
			for (int j = 0; j < ju.length; j++) {
				if( lotto[i] == ju[j] ) {
					num = num + 1;
				}
			}
		}
		
		// 보너스 번호 확인
		for (int i = 0; i < ju.length; i++) {
			if( ju[i] == lotto[6] )
				bonus = true;
		}
		 
		
		//3.결과비교
		//2개이하로 일치 (n<=2) 꽝
		if (num <=2) {
			System.out.println(0);
		}
		//3개일치 (n=3) 5등
		if (num == 3) {
			System.out.println(5);
		}
		//4개일치 (n=4) 4등
		if (num == 4) {
			System.out.println(4);
		}
		if (num == 5 ) {
			//5개 일치+보너스 (num=5),(bonus) 2등
			if( bonus == true )
				System.out.println(2);
			//5개일치 (n=5) 3등
			else
				System.out.println(3);
		}
		//6개일치 (n=6) 1등
		if (num == 6) {
			System.out.println(1);
		}			   		
	}
}
