/*题目：判断101-200之间有多少个素数，并输出所有素数。
  分析：好像没什么好分析的
*/
class PrimeNum
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i=101;i<200;i++)
		{
			boolean flag=true;
			for (int j=2;j<=i;j++ )
			{
				if(i%j==0)
				flag=false;
				break;
			}
			if(flag)
				count++;
		}
		System.out.print(count);
	}
}