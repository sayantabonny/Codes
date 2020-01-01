package hackerrank_challenge;
import java.util.*;
public class QueenAttack2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int rq=sc.nextInt();
		int cq=sc.nextInt();
		int chessBoard[][]=new int [n+1][n+1];
		chessBoard[rq][cq]=1;
		int count=1;
		while(count<=k)
		{
			count++;
			chessBoard[sc.nextInt()][sc.nextInt()]=-1;
		}
		sc.close();
		int i=0,j=0; int movable=0;
		for(i=cq-1;i>=1;i--)
		{
			if(chessBoard[rq][i]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index A "+rq+" "+i);
				movable++;
			}
		}
		for(i=cq+1;i<=n;i++)
		{
			if(chessBoard[rq][i]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index B "+rq+" "+i);
				movable++;
			}
		}
		for(i=rq+1;i<=n;i++)
		{
			if(chessBoard[i][cq]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index C "+i+" "+cq);
				movable++;
			}
		}
		for(i=rq-1;i>=1;i--)
		{
			if(chessBoard[i][cq]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index D "+i+" "+cq);
				movable++;
			}
		}
		for(i=rq-1,j=cq-1;i>=1&&j>=1;j--,i--)
		{
			if(chessBoard[i][j]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index E "+i+" ");
				movable++;
			}
		}
		for(i=rq+1,j=cq+1;i<=n&&cq<=n;i++,j++)
		{
			if(chessBoard[i][j]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index F "+i+" ");
				movable++;
			}
		}
		
		for(i=rq-1,j=cq+1;i>=1&j<=n;i--,j++)
		{
			if(chessBoard[i][j]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index G "+i+" "+j);
				movable++;
			}
		}
		for(i=rq+1,j=cq-1;i<=n&&j>=1;i++,j--)
		{
			if(chessBoard[i][j]==-1)
			{
				break;
			}
			else
			{
				//System.out.println("Index H "+i+" "+j);
				movable++;
			}
		}
		System.out.println(movable);
	}
}
