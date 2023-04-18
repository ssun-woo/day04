package for_;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 1~100사이의 숫자 n을 입력받고
		// 1~100사이에 n의 배수의 개수와 합을 구하세요
		// (1~100 범위를 벗어나면 "잘못된 입력입니다")

		int n;
		int sum = 0, num = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		n = input.nextInt();

		if (n < 0 || n > 100) {
			System.out.println("잘못된 입력입니다.");
		} else {
			for (int i = 1; i <= 100; i++) {
				if (i % n == 0) {
					num++;
					sum += i;
				}
			}
			System.out.println("1~100 " + n + "의 배수의 개수 : " + num);
			System.out.println("1~100 " + n + "의 배수의 합 : " + sum);
		}

		

	}

}
