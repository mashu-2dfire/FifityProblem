//题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
class Combination
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				for(int k=1;k<5;k++)
				{
					if(i!=j&&i!=k&&j!=k)
					{
						sum++;
						System.out.println(100*i+10*j+k);
					}
				}
			}
		}
		System.out.println("一共有："+sum+"个不重复的三位数");
	}
}
