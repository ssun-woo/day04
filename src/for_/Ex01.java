package for_;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		 for(초기값; 조건식; 증감식){
		 	종속문장
		 }
		 
		 반복문을 사용할 경우
		 - 어떠한 식이 동일하게 동작해야 하는 경우
		 - 어떠한 값이 규칙적으로 변하는 경우
		 */
		
		// 반복문을 사용하지 않을 경우
		int i = 1, sum = 0;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		sum += i; i++;
		System.out.println("1~10 합 : " + sum);
		
		
		// 반복문을 사용할 경우
		int j, sum1 = 0;
		for(j=1; j<=10; j++ ) {
			sum1 = sum1 + j;
		}
		System.out.println("1~10의 합 : " + sum1);
		System.out.println("j : " + j); // j가 11이 되고 조건식과 비교해서 만족하지 않으므로 빠져나옴
	
	
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("반복 횟수 입력 : ");
		num = input.nextInt();
		
		for(int k=0 ; k < num ; k++) {
			System.out.println("k : " + k);
		}
	
	
	
	}
	
	
	
	
	
	
	
}
























































