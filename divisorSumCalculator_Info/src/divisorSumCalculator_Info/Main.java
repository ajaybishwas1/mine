package divisorSumCalculator_Info;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		DivisorSum obj = new Solution();
		
		Integer num = sc.nextInt();
		
		System.out.println(obj.divisorSum(num));
		
		sc.close();
	}

}


