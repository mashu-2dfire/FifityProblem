/*��Ŀ���ж�101-200֮���ж��ٸ����������������������
  ����������ûʲô�÷�����
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