/*
������14�� 
��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿 
*/
import java.util.Scanner;
class  NumDay
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int days=0;
		int num[]={31,28,31,30,31,30,31,31,30,31,30,31};
		while(scan.hasNext())
		{
			int year=scan.nextInt();
			int mounth=scan.nextInt();
			int day=scan.nextInt();
			if(mounth>12)//�·ݲ��Ϸ�ʱ
			{
				System.out.println("�·��������");
				System.exit(-1);
			}
			if(mounth==2)//�������Ϸ�ʱ
			{
				if(isLeapYear(year))//Ϊ����
				{
					if(day>29)
					{
						System.out.println("�����������");
						System.exit(-1);
					}
				}
				else //��Ϊ����
					if(day>28)
					{
						System.out.println("�����������");
						System.exit(-1);
					}
			}
			for(int i=1;i<mounth;i++)
				days+=num[i];
			days+=day;
			if(isLeapYear(year)&&mounth>2)
				days++;
			System.out.println(days);
				
		}
	}
	public static boolean isLeapYear(int num)//�ж��Ƿ�Ϊ����
	{
		if(((num%4==0)&&(num%100!=0))||num%400==0)
			return true;
		else
			return false;
	}
}
