package hackerrank_challenge;
import java.util.*;
public class Climbing_the_LeaderBoard {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no_ofPlayers=sc.nextInt();
		int ar_leaderBoard[]=new int[no_ofPlayers];
		
		
		for(int i=0;i<no_ofPlayers;i++)
		{
			ar_leaderBoard[i]=sc.nextInt();
			
		}
		sc.close();
		int no_ofGamesPlayed=sc.nextInt(); int score; int rank; int flag=0; int temp1,temp2=0;int j=0; int index=no_ofPlayers;
		int output[]=new int[no_ofGamesPlayed];
		for(int i=0;i<no_ofGamesPlayed;i++)
		{
			rank=1; flag=0;
			score=sc.nextInt();
			for( j=0;j<no_ofPlayers-1;j++)
			{
				temp1=temp2;
				temp2=ar_leaderBoard[j+1];
				if(ar_leaderBoard[j]<score && flag==0)
				{
					flag=1;
					temp1=ar_leaderBoard[j];
					ar_leaderBoard[j]=score;
					index=j;
				}
				
				if(flag==1)
				{
					ar_leaderBoard[j+1]=temp1;
					
				}
				
			//	System.out.println(ar_leaderBoard[j]+" hi");
				
			}
		   if(ar_leaderBoard[j]<score && flag==0)
			{
				ar_leaderBoard[j]=score;
				index=j;
			}
		   if(ar_leaderBoard[j]>score && flag==0)
		   {
			   flag=-1;
			   
		   }
		  
		   
			   for(int k=1;k<no_ofPlayers & k<=index;k++)
			   {
				  // System.out.println(" ho ho "+ar_leaderBoard[k]);
				   if(ar_leaderBoard[k]==ar_leaderBoard[k-1])
				   {
					   continue;
				   }
				   else
				   {
					   rank++;
				   }
			   }
		   if(flag==-1)
		   {
			   rank++;
		   }
		   output[i]=rank;
		}
		for(int i=0;i<no_ofGamesPlayed;i++)
		{
			System.out.println(output[i]);
		}
	}

}
