//��Ŀ��һ��������������100����һ����ȫƽ������
//�ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣� 
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
