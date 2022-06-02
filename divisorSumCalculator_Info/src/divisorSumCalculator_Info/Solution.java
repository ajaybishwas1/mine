package divisorSumCalculator_Info;

public class Solution implements DivisorSum {
	
	private static int counter =0;
	
	private final float constantValue =1;
	
	@Override
	public Double divisorSum(Integer num) {
		
		int sum =0;
		if(num<1000)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					sum+=i;
					counter++;
				}
			}
			return (double) ((sum+counter)*constantValue);
		}
		
		
		return 0.0;
	}

}
