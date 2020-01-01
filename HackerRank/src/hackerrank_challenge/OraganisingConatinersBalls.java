package hackerrank_challenge;
import java.math.BigInteger;
import java.util.*;
public class OraganisingConatinersBalls {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();int n; int input[][]; BigInteger row[],column[];BigInteger sum_row=BigInteger.ZERO,sum_col=BigInteger.ZERO;int flag=-1;
		while(q>0)
		{
			q--;
			n=sc.nextInt();
			input=new int[n][n];
			row=new BigInteger[n];
			column=new BigInteger[n];
			flag=-1;sum_row=BigInteger.ZERO;sum_col=BigInteger.ZERO;
			for(int i=0;i<n;i++)
			{
				sum_row=BigInteger.ZERO;
				for(int j=0;j<n;j++)
				{
					input[i][j]=sc.nextInt();
					sum_row=sum_row.add(BigInteger.valueOf(input[i][j]));
				}
				row[i]=sum_row;
			}
			for(int i=0;i<n;i++)
			{
				sum_col=BigInteger.ZERO;
				for(int j=0;j<n;j++)
				{
					sum_col=sum_col.add(BigInteger.valueOf(input[j][i]));
					
				}
				column[i]=sum_col;
				//System.out.println(row[i]+" "+column[i]+" ");
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(row[i].equals(column[j]))
					{
						column[j]=BigInteger.valueOf(-1);
						flag=1;
						break;
					}
				}
				if(flag==-1)
				{
					break;
				}
			}
			if(flag==-1)
			{
				System.out.println("Impossible");
			}
			else
			{
				System.out.println("Possible");
			}
		}
	}

}
