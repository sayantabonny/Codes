package hackerrank_challenge;
import java.util.*;
public class Array_Manipulation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar[]=new int[n+1]; int min_pos=n-1;int max_pos=0;
		int sign[]=new int[n+1];
		long max=0,sum=0;
		for(int i=0;i<m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int k=sc.nextInt();
			ar[a]=ar[a]+k;
			ar[b]=ar[b]+k;
			sign[b]=sign[b]-k;
			if(a<min_pos)
			{
				min_pos=a;
			}
			if(b>max_pos)
			{
				max_pos=b;
			}	
		}
		
		for(int i=min_pos;i<=max_pos;i++)
		{
			
			sum=sum+ar[i]+sign[i];
			System.out.println(i+" "+sum+ " "+sign[i]);
			if(sum>max)
			{
				max=sum;
			}
			sum=sum+sign[i];
		}
		
		 
		sc.close();
		
		System.out.println(max);
	}
	
}

	

    

