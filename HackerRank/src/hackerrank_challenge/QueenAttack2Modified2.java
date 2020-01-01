package hackerrank_challenge;
import java.util.*;
public class QueenAttack2Modified2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r[]=new int[k];
		int c[]=new int[k];
		int rq=sc.nextInt();
		int cq=sc.nextInt();
		int count=0; int movable=0;
		int righttop_dia=(n-rq)>(n-cq)?n-cq:n-rq;
		int lefttop_dia=(n-rq)>(cq-1)?cq-1:n-rq;
		int rightdown_dia=(rq-1)>(n-cq)?n-cq:rq-1;
		int leftdown_dia=(rq-1)>(cq-1)?cq-1:rq-1;
		movable=((n-1)*2)+righttop_dia+lefttop_dia+rightdown_dia+leftdown_dia;
		if(k==0)
		{
			System.out.println(movable);
		}
		else
		{
			int temp_RT_dia=righttop_dia,temp_LT_dia=lefttop_dia,temp_RD_dia=rightdown_dia,temp_LD_dia=leftdown_dia;
			int temp_top=n,temp_down=0,temp_right=n,temp_left=0;
			while(count<k)
			{
				
				r[count]=sc.nextInt();
				c[count]=sc.nextInt();
				
				if(r[count]==rq)
				{
					//System.out.println(r[count]+" "+c[count]+" A");
					if(c[count]>cq&&temp_right>c[count])
					{
						temp_right=c[count];
						//System.out.println(r[count]+" "+c[count]+" A1");
						//System.out.println("hohohooh"+temp_right);
					}
					else if(c[count]<cq&&temp_left<c[count])
					{
						//System.out.println(r[count]+" "+c[count]+" A2");
						temp_left=c[count];
						//System.out.println("Hihihi"+temp_left);
					}
				}
				else if(c[count]==cq)
				{
					//System.out.println(r[count]+" "+c[count]+" B");
					if(r[count]>rq&&temp_top>r[count])
					{
						//System.out.println(r[count]+" "+c[count]+" B1");
						temp_top=r[count];
						//System.out.println("huehuehuehue"+temp_top);
					}
					else if(r[count]<rq&&temp_down<r[count])
					{
						//System.out.println(r[count]+" "+c[count]+" B2");
						temp_down=r[count];
						//System.out.println("lolololo"+temp_down);
					}
				}
				else if(Math.abs(rq-r[count])==Math.abs(cq-c[count]))
				{
					//System.out.println(r[count]+" "+c[count]+" C");
					if(r[count]-rq>0&&c[count]-cq>0&&(r[count]-rq-1)<temp_RT_dia)
					{
						//System.out.println(r[count]+" "+c[count]+" C1");
						temp_RT_dia=r[count]-rq-1;
						//System.out.println("holllllllaaaaa"+temp_RT_dia);
					}
					else if(r[count]-rq<0&&c[count]-cq>0 &&(c[count]-cq-1)<temp_RD_dia )
					{
						//System.out.println(r[count]+" "+c[count]+" C2");
						temp_RD_dia=c[count]-cq-1;
						//System.out.println("Amigooooo"+temp_RD_dia);
					}
					else if(r[count]-rq<0&&c[count]-cq<0 &&(Math.abs(cq-c[count])-1)<temp_LD_dia)
					{
						//System.out.println(r[count]+" "+c[count]+" C3");
						temp_LD_dia=Math.abs(cq-c[count])-1;
						//System.out.println("hiiiiiiiiiiiii"+temp_LD_dia);
					}
					else if(r[count]-rq>0 && c[count]-cq<0&&(r[count]-rq-1)<temp_LT_dia)
					{
						//System.out.println(r[count]+" "+c[count]+" C4");
						temp_LT_dia=r[count]-rq-1;
						//System.out.println("Yoyo"+temp_LT_dia);
					}
				}
				count++;
			}
			movable=temp_RT_dia+temp_LD_dia+temp_RD_dia+temp_LT_dia;
			//System.out.println(" "+movable);
			movable=movable+(temp_top-temp_down-2);
			movable=movable+(temp_right-temp_left-2);
			System.out.println(movable);
		}
		sc.close();
		
		
	}
}
