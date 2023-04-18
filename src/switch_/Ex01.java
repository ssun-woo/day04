package switch_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * Switch .. case 문 >> if, if else로 전부 표현가능
		 * 
		 * switch(식){ case 1 : 종속문장 break; case 2 : 종속문장 break; case ... default : 종속문장
		 * break; }
		 * 
		 * case옆 숫자(식)와 일치하는 종속문장만 실행되고 일치하는게 없다면 default의 종속문장 실행
		 */

		Scanner input = new Scanner(System.in);
		int num;

		System.out.print("수 입력 : ");
		num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("1입력");
			break;		// break 제외 하면 밑에 나머지 case까지 전부 실행(break를 만나야 switch 문을 빠져나옴)
		case 2:
			System.out.println("2입력");
			break;
		default:
			System.out.println("1,2제외한 값 입력");
			break;
		}
		System.out.println("다음 문장 실행");

	}

}
