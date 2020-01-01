package hackerrank_challenge;
import java.util.*;
public class Encryption {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll("\\s","");
		sc.close();
		double s=Math.pow(str.length(), 0.5);
		int up=(int)Math.ceil(s);
		int down=(int)Math.floor(s);
		//System.out.println(str+" "+str.length()+" "+s+" "+up+" "+down+" ");
		int row,col;
		if(up*down<str.length())
		{
			col=up;
			row=up;
		}
		else
		{
			col=up;
			row=down;
		}
		for(int i=1;i<=col;i++)
		{
			for(int j=i;j<=row*col;j=j+col)
			{
				if(j-1>=str.length())
				{
					break;
				}
				System.out.print(str.charAt(j-1));
			}
			System.out.print(" ");
		}
	}

}
