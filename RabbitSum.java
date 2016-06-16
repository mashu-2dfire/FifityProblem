
/**
 *@Description：题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
  假如兔子都不死，问每个月的兔子总数为多少？ 
        程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21.... 
 *@author ：Lanting
 */

import java.util.*;
class RabbitSum
{
	public static void main(String[] args) 
	{
		List<Rabbit> rl=new ArrayList<Rabbit>();
		rl.add(new Rabbit());/*只有父亲兔子刚出生的时候是0，第一次遍历时年龄变成了1。*/
		for(int i=1;i<9;i++)//所有的兔子都随着月份的增加而变大。
		{
			int j=0;
			Iterator<Rabbit> it=rl.iterator();
			while(it.hasNext())
			{
				Rabbit rabbit=it.next();
				rabbit.ageIncrease();
				if(rabbit.getAge()>=3)
				{
					j++;
				}
			}
			for(;j>0;j--)
			{
				rl.add(new Rabbit(1));//在新一次的遍历中应该有几个兔子已经一岁了
			}
			System.out.println(rl.size());//将新出生的兔子加上，则为总数。
		}
	} 
}
class Rabbit
{
	private int age=0;
	public Rabbit(){}
	public Rabbit(int i)
	{
		this.age=i;
	}
	public void ageIncrease()
	{
		age++;
	}
	public int getAge()
	{
		return age;
	}
}

//表示看到题时懵逼了一会，一个劲地在分析数据的变化，最后才反应过来可以用for循环来模拟生长过程//
//Rabbit类的封装，以及sum的计算对是解决问题的关键