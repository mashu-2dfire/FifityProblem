//题目：一个整数，它加上100后是一个完全平方数，
//再加上168又是一个完全平方数，请问该数是多少？ 
class SearchSqrt
{
	public static void main(String[] args) 
	{
		int i=0;
		while(true)
		{
			if(Math.sqrt(i+100)%1==0)
			{
				if(Math.sqrt(i+168)%1==0)
				{
					System.out.println(i);
					break;
				}
			}
			i++;
		}
	}
}
