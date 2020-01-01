package hackerearth_graph;

import java.util.*;

public class Mock_at_graphFactory {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); int sum=0;
		int counter=0;
		while(counter<n)
		{
			sum=sum+sc.nextInt();
			counter++;
		}
		if(2*(n-1)==sum)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		sc.close();
	}
}


