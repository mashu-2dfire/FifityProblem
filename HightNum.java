//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下
//求它第10次落地时，共经过多少米？第10次反弹多高？
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
				System.out.println("输入不符合要求");
				continue;
			}
			if(num==1)
			{
				System.out.println("反弹了多少米："+sum);
				continue;
			}
			for(int i=2;i<=num;i++)
			{
				sum+=hight;
				hight=hight/2;
			}
			System.out.println("反弹高度为："+sum);
			System.out.println("第"+num+"反弹高度为："+hight/2);
		}
	}
}
