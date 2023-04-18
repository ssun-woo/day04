package switch_;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		
		// 날짜를 입력받아 1일이면 '월' 2일이면 '화' ... 7일 '일' 8일'월' 숫자에 맞춰 요일을 출력하세요
		Scanner input = new Scanner(System.in); 
		int day;
		
		while(true) {
			System.out.print("날짜 입력 : ");
			day = input.nextInt();
			
			switch(day % 7) {
			case 1 : 
				System.out.println(day + " : " + day/7 + "번째 주 월요일");
				break;
			case 2 : 
				System.out.println(day + " : " + day/7 + "번째 주 화요일");
				break;
			case 3 : 
				System.out.println(day + " : " + day/7 + "번째 주 수요일");
				break;
			case 4 : 
				System.out.println(day + " : " + day/7 + "번째 주 목요일");
				break;
			case 5 : 
				System.out.println(day + " : " + day/7 + "번째 주 금요일");
				break;
			case 6 : 
				System.out.println(day + " : " + day/7 + "번째 주 토요일");
				break;
			case 0 :
				if(day == 0) {
					System.out.println(day + " : 0번째 주 일요일");
					break;
				}
				System.out.println(day + " : " + (day/7-1) + "번째 주 일요일");
				break;
			default :
				System.out.println("잘못입력했습니다");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
