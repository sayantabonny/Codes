package hackerrank_challenge;

import java.util.*;

public class Climbing_the_LeaderBoardModified {
	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int players= sc.nextInt(); 
		int test=0;
		int leaderBoard[]=new int[players]; int count=1; int i=0,j=0,value=0;int rank=leaderBoard.length;int flag=-1;
		leaderBoard[0]=sc.nextInt();
		for( i=1;count<players;i++,count++)
		{
			leaderBoard[i]=sc.nextInt();
			if(leaderBoard[i-1]==leaderBoard[i])
			{
				i--;
			}
		}
		//System.out.println(i+"dfndfn,dnf,dnf   ");
		
		  while(i<players) { 
			  leaderBoard[i]=-1;
		  System.out.print("Yo yo "+i); 
		  i++; 
		  }
		 
		int limit=leaderBoard.length-1;
		int scores=sc.nextInt();
		for(j=1;j<=scores;j++)
		{
			value=sc.nextInt();
			if(rank==199784)
			{
				test++;
			}
			//System.out.println(value+"hogoohohoh"+scores);
			flag=-1; limit=rank;
			if(value==leaderBoard[rank-1])
			{
				System.out.println(rank);
				continue;
			}
			for(i=limit-1;i>=0;i--)
			{
				/*if(leaderBoard[i]==value)
				{
					rank=i+1;
					System.out.println("Holla "+value);
					flag=1;
					break;
				}*/
				if(leaderBoard[i]<=value)
				{
					if(i+1==limit)
					{
						rank=i+1;
						flag=1;
						continue;
					}
					else
					{
						leaderBoard[i+1]=leaderBoard[i];
						leaderBoard[i]=value;
						flag=1;
						rank=i+1;
					}
				}
				else
				{
					break;
				}
			}
			if(flag==1)
			{
				leaderBoard[rank-1]=value;
				System.out.println(rank);
			}
			else
			{
				System.out.println(leaderBoard.length+1);
			}
		}
		sc.close();
		System.out.print(test);
	}
}
