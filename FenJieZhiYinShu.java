/*
��Ŀ����һ���������ֽ���������
���磺����90,��ӡ��90=2*3*3*5�� 
�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
(2)���n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ�������n,�ظ�ִ�е�һ���� 
(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
*/
import java.util.*;
class FenJieZhiYinShu
{
	private static List<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext())
		{
			int num=scan.nextInt();
			List<Integer> list=method(num);
			for(int i=0;i<list.size();i++)
			{
				if(i==(list.size()-1))
				{
					System.out.print(list.get(i));
					return;
				}
				System.out.print(list.get(i)+"*");
			}
		}
	}
	public static List<Integer> method(int num)
	{
		int k=2;
		while(true)
		{
			if(k==num)
				break;
			else if(num%k==0)
			{
				num=num/k;
				list.add(k);
				method(num);
			}
			else
			{
				k++;
			}
		}
		return list;
	}
}
