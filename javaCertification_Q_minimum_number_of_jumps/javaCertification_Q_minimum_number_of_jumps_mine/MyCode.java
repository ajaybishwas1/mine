package javaCertification_Q_minimum_number_of_jumps;

import java.util.Scanner;

public class MyCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noe = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		String str = sc2.nextLine();
		
//		String words[] = str.split(" ");
		
		int num[] = new int[noe];
		
		for(int i=0;i<num.length;i++)
		{
//			num[i] =Integer.parseInt(words[i]);
			num[i] =sc.nextInt();
		}
		
		int sum=0,count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=0)
			{
				if(sum<=noe)
				{
					sum+=num[i];
					count++;
					continue;
				}
			}
			else
			{
				break;
			}
		}
		if(sum>=noe)
		{
		System.out.println(count);
		}
		else
			System.out.println("infinite");
	}
}
