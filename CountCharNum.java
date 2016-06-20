//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
import java.util.Scanner;
class CountCharNum
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext())
		{
			String str=scan.nextLine();
			char[] ch=str.toCharArray();
			int alphabet=0;
			int space=0;
			int number=0;
			int other=0;
			for(int i=0;i<ch.length;i++)
			{
				if(
					(ch[i]>='a'&&ch[i]<='z')||
					(ch[i]>='A'&&ch[i]<='Z')||
					(ch[i]>='\u4e00'&&ch[i]<='\u9fa5')
					)
					alphabet++;
				else if(ch[i]==' ')
					space++;
				else if(ch[i]<='9'&&ch[i]>='0')
					number++;
				else
					other++;
			}
			System.out.println("中英文数:"+alphabet);
			System.out.println("空格数:"+space);
			System.out.println("数字数:"+number);
			System.out.println("其他:"+other);
		}
	}
}

