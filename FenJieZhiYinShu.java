/*
题目：将一个正整数分解质因数。
例如：输入90,打印出90=2*3*3*5。 
程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成： 
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。 
(2)如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。 
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
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
