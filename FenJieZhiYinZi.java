import java.util.Scanner;
import java.util.*;
//��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5
class FenJieZhiYinZi
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt())
		{
			int num=scan.nextInt();
			List<Integer> list=method(num);
			for(int i=0;i<list.size();i++)//�����������
			{
				if(i==(list.size()-1))
				{
					System.out.print(list.get(i));
				}
				else
				System.out.print(list.get(i)+"*");
			}
			System.out.println();
		}
	}
	public static List<Integer> method(int num)
	{
		List<Integer> list=new ArrayList<Integer>();
		int k=2; 
		while(true)//kֵ��С���������k����Ҫ���һ������������
		{
			if(k>num)//ѭ����ϣ��˳�
				break;
			if(num%k==0)//����Ҫ��������뼯��
			{
				list.add(k);
				num=num/k;//numֵ����
				k=2;//kֵ����
			}
			else
				k++;
		}
		return list;//���ؽ������
	}
}
