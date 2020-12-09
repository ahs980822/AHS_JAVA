package test;

public class test04 {
	public static void main(String[] args) {
		// 베열 선언 및 초기화
		// 배열의 크기 : 7  -> week.length 
		String week[] = {"월","화","수","목","금","토","일"};
		
		// 반복문
		// index : 반복의 순서를 나타내는 순서번호
		// for( ①[초기식] ; ②[조건식] ; ④[증감식] ) {③}
		// ① > 반복( ② > ③ > ④ )
		// i++;   ::   i = i + 1;
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + "요일 ");
		}
		
		System.out.println();
		
		// for-each(Advanced for)
		// 자료구조의 모든 요소를 순회
		for (String str : week) {
			System.out.print(str + "요일 ");		// str == week[i]
		}
		
	}
}


