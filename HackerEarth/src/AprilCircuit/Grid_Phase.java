package AprilCircuit;
import java.util.*;
public class Grid_Phase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		String input="";
		String horizontal="";
		String vertical="";
		String diagonal_1="";
		String diagonal_2="";
		String temp="";
		int count=0;
		for(int i=0;i<=r;i++)
		{
			temp=sc.nextLine();
			temp=temp.replaceAll("\\s", "");
			input=input+temp;
			count= count+occurence(temp,"saba");
		}
	//	System.out.println(input);
		for(int i=0;i<c;i++)
		{
			temp="";
			for(int j=0;j<r;j++)
			{
				//System.out.println(input.charAt(i+(j*c)));
				temp=temp+input.charAt(i+(j*c));
			}
			count= count+occurence(temp,"saba");
		}
		int row=0;
		for(int i=3;i<=r;i++)
		{
			row=i;
			diagonal_1="";
			if(row>=r)
			{
				row=r-1;
				for(int j=1;j<c&&row>=0;j++)
				{
					diagonal_1=input.charAt(row+(j*r))+diagonal_1;
					row--;
				}	
				//System.out.println(diagonal_1);
				count=count+occurence(diagonal_1,"saba");
			}
			else
			{
				for(int j=0;j<=i&&row>=0;j++)
				{
					
					diagonal_1=input.charAt(row+(j*r))+diagonal_1;
					row--;
				}
				//System.out.println(diagonal_1);
				count=count+occurence(diagonal_1,"saba");
			}
		}
		
		int co=c-3; int col1=0;
		for(int i=0;i<=r-4;i++)
		{
			row=i;
			diagonal_1="";
			if(i==0)
			{
				for(int j=col1;j<c && row<r;j++)
				{
					diagonal_1=input.charAt(row+(j*r))+diagonal_1;
					row++;
					
				}
				co--;
				if(co!=0)
				{
					i=-1;
				}
				//System.out.println(diagonal_1+" "+co);
				count=count+occurence(diagonal_1,"saba");
				col1++;
			}
			else
			{
				for(int j=0;j<c&&row<r;j++)
				{
					
					diagonal_1=input.charAt(row+(j*r))+diagonal_1;
					row++;
				}
				//System.out.println(diagonal_1);
				count=count+occurence(diagonal_1,"saba");
				
			}
		}
		
		System.out.println(count);
	}
	public static int occurence(String str,String findStr)
	{
		int lastIndex = 0;
		int count = 0;
	
		while(lastIndex != -1){
	
		    lastIndex = str.indexOf(findStr,lastIndex);
	
		    if(lastIndex != -1){
		        count ++;
		        lastIndex ++;
		    }
		}
		return count;
	}
}
