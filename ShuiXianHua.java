/*
��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
*/
import java.util.Scanner;
class  ShuiXianHuaShu
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in); //�������ж�ȡ����
		while (in.hasNext())
		{
			int num=in.nextInt();
			int temp=num;
			int max=count(num);//�ж�����һ���м�λ
			int sum=0;
			for(int i=0;i<max;i++)//ѭ���ۼ�
			{
				int x=temp%10;
				sum+=x*x*x;
				temp=temp/10;
			}
			if(sum==num)//�ۼӽ���Ƿ���ԭ����һ��
				System.out.println(num);

		}

	}
	public static int count(int num)//����λ��
	{
		int max=0;
		while(true)
		{
			if(num==0)
				break;
			num=num/10;
			max++;
		}
		return max;
	}
}
