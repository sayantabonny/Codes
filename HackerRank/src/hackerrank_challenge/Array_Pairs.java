package hackerrank_challenge;
import java.util.*;

public class Array_Pairs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		long max=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int ans=0;long num1=0,num2;
		for(int i=0;i<n;i++)
		{
			max=ar[i];num1=ar[i];
			for(int j=i+1;j<n;j++)
			{
				 num2=ar[j];
				if(num2>max)
				{
					max=num2;
				} 
				
				if(num1*num2<=max)
				{
					//System.out.println(ar[i]+"  "+ar[j]+"  "+ar[i]*ar[j]+"   "+max);
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
		

	}
}
