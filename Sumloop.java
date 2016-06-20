//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
//例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
import java.util.Scanner; 
public class Sumloop 
{    
	public static void main(String[] args)  
	{
		System.out.print("请输入a的值：");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.print("请输入个数：");
		int num=scan.nextInt();
		int sum=0;
		int temp=a;
		for(int i=0;i<num;i++)
		{
			sum+=temp;
			temp=temp*10+a;
		}
		System.out.println(sum);
	}
}