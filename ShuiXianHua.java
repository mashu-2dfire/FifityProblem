/*
题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
*/
import java.util.Scanner;
class  ShuiXianHuaShu
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in); //从命令行读取数字
		while (in.hasNext())
		{
			int num=in.nextInt();
			int temp=num;
			int max=count(num);//判断数字一共有几位
			int sum=0;
			for(int i=0;i<max;i++)//循环累加
			{
				int x=temp%10;
				sum+=x*x*x;
				temp=temp/10;
			}
			if(sum==num)//累加结果是否与原数字一致
				System.out.println(num);

		}

	}
	public static int count(int num)//数字位数
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
