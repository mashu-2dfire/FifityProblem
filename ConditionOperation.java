/*题目：利用条件运算符的嵌套来完成此题：
学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
*/
import java.util.Scanner;
class  ConditionOperation
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext())
		{
			int num=scan.nextInt();
			if(num<0)
				System.out.println("输入不合法");
			else if(num>=90)
				System.out.println("A");
			else if(num>=60)
				System.out.println("B");
			else
				System.out.println("c");
		}
	}
}
