/*��Ŀ�����������������Ƕ������ɴ��⣺
ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ
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
				System.out.println("���벻�Ϸ�");
			else if(num>=90)
				System.out.println("A");
			else if(num>=60)
				System.out.println("B");
			else
				System.out.println("c");
		}
	}
}
