//��һ���������Լ������С������
import java.util.Scanner;
class  GCDAndLCM
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt())
		{
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			if(num1<0||num2<0)
			{
				System.out.println("���벻�Ϸ�");
				System.exit(-1);
			}
			int gcd=1;
			int lcm=0;
			for(int i=2;i<=num1&&i<=num2;i++)
			{
				if(num1%i==0)
				{
					if(num2%i==0)
						gcd=i;
					int a=num1/gcd;
					int b=num2/gcd;
					lcm=a*b*gcd;
				}
			}
			System.out.println("���Լ��Ϊ��"+gcd);
			System.out.println("��С������Ϊ��"+lcm);
		}
	}
}
