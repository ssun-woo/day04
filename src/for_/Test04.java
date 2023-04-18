package for_;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

//		문제1 번
//		| for 반복문 |
//		어느 홈페이지에서 1초 단위로 20원을 벌 수 있는 홈페이지가 있다. 단 10초 단위마다 한 텀 쉬어간다고 한다면 1분에는 얼마를 벌 수 있는가
//
//		문제 2번 
//		단수를 입력하면 해당하는 단의 구구단을 출력해주는 프로그램 만들기
//
//		문제 3번
//
//		출력결과를 쓰시오 
//
//		public static void main(String[] args) {
//
//		int a = 0;
//		int i;
//		for (i =3 ; i<100; i*=3) {
//			a *= i ;
//		}
//		System.out.println(a);

//		System.out.println(i); (시간나면 이문제도 풀어보세요)
		
		
		// 문제1
		 
//		int money = 0;
//		for(int i=0; i<60; i++) {
//			money += 20;
//			if(i%10 == 0) {
//				money -= 20;
//			}
//		}
//		
//		System.out.println(money);
		
		
		
		// 문제2 
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("단수 입력 : ");
//		int num = scan.nextInt();
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(num + "*" + i + "=" + num*i);
//		}
		
		
		// 문제 3
		
		// 0
		// 3 9 27 
		
		int a = 0;
		int i;
		for (i =3 ; i<100; i*=3) {
			a *= i ;
		}
		System.out.println(a);
		System.out.println(i); // 3 9 27 81 243
			
	
	}

		
}
