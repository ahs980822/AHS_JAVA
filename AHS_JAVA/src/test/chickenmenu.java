package test;

import java.util.Scanner;

public class chickenmenu {
	
	// 메소드 정의
	// [접근지정자] (static) [반환타입] [메소드명]( [매개변수] ) {}
	public static void showMenu() {
		System.out.println("########## 치킨 메뉴판 ##########");
		System.out.println("1. 뿌링클 치킨");
		System.out.println("2. 마라 치킨");
		System.out.println("3. 오리지널 치킨");
		System.out.println("0. (종료)");
		System.out.print("########## 입력 : ");
	}
	
	public static void main(String[] args) {
		// (필요한 변수) 	: (메뉴번호), (메뉴)
		// (메뉴판 메소드)  : showMenu()
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String menu = "";
		
		// do~while
		// 무조건 1번은 실행 후, 조건을 확인
		do {
			// 1. 메뉴판 출력
			//    메소드 호출
			showMenu();
			
			// 2. 메뉴번호 입력
			num = sc.nextInt();
			
			// 3. 메뉴 주문
			//    0 	: 종료
			//    1,2,3	: [메뉴] + 주문이 완료되었습니다. 
			//    etc   : (0~3) 사이의 숫자를 입력해주세요.
			if( num == 0 )
				break;			// 반복문 탈출
			
			switch (num) {
				case 1: 
						menu = "뿌링클 치킨";
						break;
				case 2: 
						menu = "마라 치킨";
						break;
				case 3: 
						menu = "오리지널 치킨";
						break;

				default:
						break;
			}
			
			if( num <= 3 )
				System.out.println("\'" + menu + "\'" + "이(/가) 주문되었습니다!!! \n");
			else
				System.out.println("(0~3) 사이의 숫자를 입력해주세요. \n");
			
			
		} while( true );
		
		
		
	}
}