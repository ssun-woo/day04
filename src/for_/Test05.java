package for_;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

//		1. 입력받은 정수(학생수)만큼 성적을 입력하고, 총점과 평균을 구하세요😁
//
//		2. while문으로 원하는 만큼 정수를 받고, 그 값들의 합을 구하세요✌️ 
//		  (0을 누르면 while문을 종료하고 최종 값을 보여준다!)
//
//		3. 하나의 정수를 입력받아 1부터 입력받은 수까지의 합을 출력세요😅

		// 1번
		Scanner scan = new Scanner(System.in);
//		int student, sum=0, grade;
//		
//		System.out.print("학생 수 입력 : ");
//		student = scan.nextInt();
//		
//		for(int i=1; i<=student; i++) {
//			System.out.print(i + "번째 학생 성적 입력 : ");
//			grade = scan.nextInt();
//			sum += grade;
//		}
//		System.out.println("학생들의 성적 총합 : " + sum);

		// 2번

//		int num, sum =0;
//
//		while (true) {
//			System.out.print("정수 입력 : ");
//			num = scan.nextInt();
//			sum += num;
//			
//			if(num == 0) {
//				System.out.println("종료");
//				return;
//			}
//			
//			System.out.println("총합 : " + sum);
//		}
		
		// 3번
		
		int num2, sum2=0;
		System.out.print("정수 입력 : ");
		num2 = scan.nextInt();
		for(int i=1; i<=num2; i++) {
			sum2 += i;
		}
		
		System.out.println("총합 : " + sum2);
		
	}
}











