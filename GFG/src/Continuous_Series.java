import java.util.*;

public class Continuous_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();int n,temp,temp2,c=0,total=0;
		int ar[]=new int [t];
		while(t>0)
		{
			n=sc.nextInt();
			temp=sc.nextInt();
			for(int i=1;i<n;i++)
			{
				temp2=sc.nextInt();
				if(temp2==temp+1)
				{
					c++;
					//System.out.println(c);
				}
				else
				{
					if(c>0)
					{
						total++;
						c=0;
					}
				}
				temp=temp2;
			}
			if(c>0)
			{
				total++;
				c=0;
			}
			//System.out.println(total);
			ar[t-1]=total;
			total=0;c=0;t--;
		}
		for (int i=ar.length-1;i>=1;i--)
		{
			System.out.println(ar[i]);
		}

	}

}
