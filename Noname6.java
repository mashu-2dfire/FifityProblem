/*
������18�� 
��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
�ѳ�ǩ���������������������Ա����������������
a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ������� 
*/
class  Match
{
	public static void main(String[] args) 
	{
		char a[]={'a','b','c'};
		char b[]={'x','y','z'};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==0&&j==0)
					continue;
				if(i==2&&(j==0||j==2))
					continue;
				else
					System.out.println(a[i]+"<----->"+b[j]);
			}
		}
	}
}
