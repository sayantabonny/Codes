package hackerrank_challenge;
import java.util.*;
public class QueenAttack2Modified {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r[]=new int[k];
		int c[]=new int[k];
		int rq=sc.nextInt();
		int cq=sc.nextInt();
		int count=0;
		while(count<k)
		{
			
			r[count]=sc.nextInt();
			c[count]=sc.nextInt();
			count++;
		}
		sc.close();
		int i=0,j=0; int movable=0;
		int flag=-1;
		for(i=cq-1;i>=1;i--)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(rq==r[counter]&&i==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of A "+rq+" "+i);
				movable++;
			}
		}
		flag=-1;
		for(i=cq+1;i<=n;i++)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(rq==r[counter]&&i==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of B "+rq+" "+i);
				movable++;
			}
		}
		flag=-1;
		for(i=rq+1;i<=n;i++)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(i==r[counter]&&cq==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of C "+i+" "+cq);
				movable++;
			}
		}
		flag=-1;
		for(i=rq-1;i>=1;i--)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(i==r[counter]&&cq==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of D "+i+" "+cq);
				movable++;
			}
		}
		flag=-1;
		for(i=rq-1,j=cq-1;i>=1&&j>=1;j--,i--)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(i==r[counter]&&j==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of E "+i+" "+j);
				movable++;
			}
		}
		flag=-1;
		for(i=rq+1,j=cq+1;i<=n&&j<=n;i++,j++)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(i==r[counter]&&j==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of F "+i+" "+j);
				movable++;
			}
		}
		flag=-1;
		for(i=rq-1,j=cq+1;i>=1&j<=n;i--,j++)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(i==r[counter]&&j==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				//System.out.println("Index of G "+i+" "+j);
				movable++;
			}
		}
		flag=-1;
		for(i=rq+1,j=cq-1;i<=n&&j>=1;i++,j--)
		{
			for(int counter=0;counter<k;counter++)
			{
				if(i==r[counter]&&j==c[counter])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
			else
			{
				movable++;
			}		
		}
		System.out.println(movable);
	}
}
