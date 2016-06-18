import java.util.Scanner;
import java.util.*;
//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
class FenJieZhiYinZi
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt())
		{
			int num=scan.nextInt();
			List<Integer> list=method(num);
			for(int i=0;i<list.size();i++)//将结果结合输出
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
		while(true)//k值从小到大递增，k符合要求的一定是先是质数
		{
			if(k>num)//循环完毕，退出
				break;
			if(num%k==0)//符合要求则添加入集合
			{
				list.add(k);
				num=num/k;//num值重置
				k=2;//k值重置
			}
			else
				k++;
		}
		return list;//返回结果集合
	}
}
