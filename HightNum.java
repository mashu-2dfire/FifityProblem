//��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻������
//������10�����ʱ�������������ף���10�η�����ߣ�
import java.util.Scanner;
class  HightNum
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		while(scan.hasNext())
		{
			int num=scan.nextInt();
			double hight=100;
			int sum=100;
			if(num<0)
			{
				System.out.println("���벻����Ҫ��");
				continue;
			}
			if(num==1)
			{
				System.out.println("�����˶����ף�"+sum);
				continue;
			}
			for(int i=2;i<=num;i++)
			{
				sum+=hight;
				hight=hight/2;
			}
			System.out.println("�����߶�Ϊ��"+sum);
			System.out.println("��"+num+"�����߶�Ϊ��"+hight/2);
		}
	}
}
