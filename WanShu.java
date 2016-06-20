//题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.
//编程找出1000以内的所有完数
import java.util.ArrayList;
import java.util.List;
class  WanShu
{
	public static void main(String[] args) 
	{
		for(int i=3;i<1000;i++)
		{
			List<Integer> list=new ArrayList<Integer>();
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					list.add(j);
			}
			int sum=0;
			for(Integer k:list)
			{
				sum+=k;
			}
			if(sum==i) 
				System.out.println(i);
		}
	}
}