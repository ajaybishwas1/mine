package secondLargestIsPalindromeOrNot;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		
		
		Scanner sc =new Scanner(System.in);
		int size= sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int larg =arr[0],seclarg=0;
		
		int ch=0;
		for(int i=0; i<size; i++) {
			if(arr[i]>larg)
			{
				larg=arr[i];
				ch=i;
			}
		}
		
		seclarg=-1;
		for(int i=0; i<size; i++) {
			if(i==ch)
			{
				continue;
			}
			if(arr[i]>seclarg)
			{
				seclarg=arr[i];
			}
		}
		
		if(larg==arr[0])
		{
			seclarg=arr[1];
			for(int i=1; i<size; i++) {
				if(arr[i]>seclarg)
				{
					seclarg=arr[i];
				}
			}
		}
		
		int seclarg2 =seclarg;
		int seclarg3 =seclarg;
		
		int nod=0;
		while(seclarg!=0)
		{
			seclarg/=10;
			nod++;
		}
		
		int revnum=0,digit;
		while(seclarg3!=0)
		{
			digit = seclarg3 % 10;
			seclarg3/=10;
			int pot=1;
			for(int i=0;i<nod-1;i++)
			{
				pot*=10;
			}
			revnum+=digit*pot;
			nod--;
		}
		if(seclarg2==revnum )
		{
			System.out.println(larg + "-"+seclarg2 +"-palindrome");
		}
		else
			System.out.println(larg + "-"+seclarg2+"-notPalindrome");
			
		sc.close();
	}

}
