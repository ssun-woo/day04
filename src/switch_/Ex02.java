package switch_;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// switch 문에 들어가는 식은 int, char, String 만 사용 가능하다
		
		Scanner input = new Scanner(System.in);
		String msg = null;
		System.out.println("문자열 입력 : ");
		msg = input.next();
		
		switch(msg) {
		case "안녕" : 
			System.out.println("하세요");
			break;
		case "그래" : 
			System.out.println("반갑다");
			break;
		// default 는 else와 같기 때문에 생략가능함
		}
		System.out.println("다음 문장들 실행");
		
	}
	
	
	
	
	
	
}
