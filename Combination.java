//��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 
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
		System.out.println("һ���У�"+sum+"�����ظ�����λ��");
	}
}
