/*
【程序14】 
题目：输入某年某月某日，判断这一天是这一年的第几天？ 
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
			if(mounth>12)//月份不合法时
			{
				System.out.println("月份输入错误");
				System.exit(-1);
			}
			if(mounth==2)//天数不合法时
			{
				if(isLeapYear(year))//为闰年
				{
					if(day>29)
					{
						System.out.println("天数输入错误");
						System.exit(-1);
					}
				}
				else //不为闰年
					if(day>28)
					{
						System.out.println("天数输入错误");
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
	public static boolean isLeapYear(int num)//判断是否为闰年
	{
		if(((num%4==0)&&(num%100!=0))||num%400==0)
			return true;
		else
			return false;
	}
}
