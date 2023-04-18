package switch_;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 우리집, 회사 등록 후 보기
		String home = "등록된 집 주소가 없습니다";
		String company = "등록된 회사 주소가 없습니다";
		
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("==============");
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 종료");
			System.out.println("==============");
			System.out.print("원하는 기능 입력 : ");
			num = input.nextInt();
			
			
			switch(num) {
			case 1 : 
				System.out.print("우리집 주소 입력 : ");
				home = input.next();
				System.out.println("우리집 주소가 등록됐습니다\n");
				break;
			case 2 : 
				System.out.print("회사 주소 입력 : ");
				company = input.next();
				System.out.println("회사 주소가 등록됐습니다\n");
				break;
			case 3 : 
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + company);
				System.out.println();
				break;
			case 4 : 
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력했습니다 다시 입력해주세요\n");
			}
		}
		
		
	}
}
