//��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
//����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
import java.util.Scanner; 
public class Sumloop 
{    
	public static void main(String[] args)  
	{
		System.out.print("������a��ֵ��");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.print("�����������");
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