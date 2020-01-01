
import java.util.*;
public class Money_Exchange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		ArrayList<Integer> ar= new ArrayList<>(); int temp;
		int c=0;
		for(c=0;c<n;c++)
		{
			temp=sc.nextInt();
			if(ar.contains(temp))
			{
				continue;
			}
			ar.add(temp);
			for(int i=0;i<c;i++)
			{
				
				ar.add(Math.abs(ar.get(c)-ar.get(i)));
			}
		}
		c=0;int p=0;int flag=0;
		while(c<t)
		{
			p=sc.nextInt();
			for(int i=0;i<ar.size();i++)
			{
				if(ar.get(i)!=0 && p%ar.get(i)==0)
				{
					System.out.println("YES");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println("NO");
		}
		flag=0;
		}

	}

}
