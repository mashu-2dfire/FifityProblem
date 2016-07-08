/*
【程序15】 
题目：输入三个整数x,y,z，请把这三个数由小到大输出。 
*/
import java.util.Scanner;
class  CompareAndMove
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext())
		{
			int x=scan.nextInt();
			int y=scan.nextInt();
			int z=scan.nextInt();
			int temp=0;
			if(x>y)
			{
				temp=x;
				x=y;
				y=temp;
			}
			if(x>z)
			{
				temp=x;
				x=z;
				z=temp;
			}
			if(y>z)
			{
				temp=y;
				y=z;
				z=temp;
			}
			System.out.println("x:"+x+"  y:"+y+"   z:"+z);
		}
	}
}
