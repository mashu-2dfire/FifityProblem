/*
��Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%��
�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�
����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣�
�����5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ��
����100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž���������
*/
import java.util.Scanner;
class  Bonus
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double profits=scan.nextInt();
		double bonus=0;
		if(profits<=10)
			bonus=0.1*profits;
		else if(profits>10&&profits<=20)
			bonus=0.1*10+(profits-10)*0.075;
		else if(profits>20&&profits<=40)
			bonus=0.1*10+10*0.075+(profits-20)*0.05;
		else if(profits>40&&profits<=60)
			bonus=0.1*10+10*0.075+20*0.05+(profits-40)*0.03;
		else if(profits>60&&profits<=100)
			bonus=0.1*10+10*0.075+20*0.05+20*0.03+(profits-60)*0.015;
		else
			bonus=0.1*10+10*0.075+20*0.05+20*0.03+40*0.015+(profits-60)*0.01;
		System.out.println(bonus);
	}
}

/*����Ŀ��Ȼ������û���κ��Ѷȣ�����Ҫע�⣬��С�����֣��������Ͳ�����Ϊint��*/