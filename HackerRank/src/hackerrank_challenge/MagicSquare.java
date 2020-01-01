package hackerrank_challenge;
import java.util.*;
import java.util.stream.*;
public class MagicSquare {

	public static void main(String[] args) {
		
		/*int magic1[]=new int [8];
		int magic2[]=new int[8];*/
		int magic1[]= {8,3,4,9,2,7,6,1};
		int magic2[]= {8,1,6,7,2,9,4,3};
		int in_arr[]=new int [8];
		int diff1[]=new int[8];
		int diff2[]=new int[8];
		int i=0;
		int count=0;
		int input[][]=new int [3][3];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			input[i][0]=sc.nextInt();
			input[i][1]=sc.nextInt();	
			input[i][2]=sc.nextInt();
			if(i==1)
			{
				in_arr[7]=input[i][0];
				
				in_arr[count]=input[i][2];
				count++;
			}
			else if(i==2)
			{
				in_arr[6]=input[i][0];
				in_arr[5]=input[i][1];
				in_arr[4]=input[i][2];
			}
			else
			{
				in_arr[count]=input[i][0];
				count++;
				in_arr[count]=input[i][1];
				count++;
				in_arr[count]=input[i][2];
				count++;
			}
		}
		sc.close();
		int output=0;int temp1=10*9;
		int sum1=0,sum2=0;
		if(input[1][1]!=5)
		{
			output=Math.abs(5-input[1][1]);
			input[1][1]=5;
		}
		for(i=0;i<8;i=i+2)
		{
			for(int j=0;j<8;j++)
			{
				diff1[j]=Math.abs(in_arr[j]-magic1[j]);
				diff2[j]=Math.abs(in_arr[j]-magic2[j]);
				
				/*
				 * System.out.println();
				 * System.out.println(in_arr[j]+" "+magic1[j]+" "+magic2[j]+" "+diff1[j]+" "
				 * +diff2[j]);
				 */
			}
			sum1=IntStream.of(diff1).sum();
			sum2=IntStream.of(diff2).sum();
			/* System.out.println(sum1+ " "+sum2+" "+i); */
			int a=sum1>sum2?sum2:sum1; int replace1,replace2;
			if(temp1>a)
			{
				temp1=a;
			}
			replace2=magic1[8-1];
			replace1=magic1[8-2];
			for(int k=5;k>0;k--)
			{
				count=k-1;
				magic1[k+2]=magic1[k];
				magic1[count+2]=magic1[count];
			}
			magic1[0]=replace1;
			magic1[1]=replace2;
			
			replace2=magic2[8-1];
			replace1=magic2[8-2];
			for(int k=5;k>0;k--)
			{
				count=k-1;
				magic2[k+2]=magic2[k];
				magic2[count+2]=magic2[count];
			}
			magic2[0]=replace1;
			magic2[1]=replace2;
			
		}
		output=output+temp1;
		
		System.out.println(output);
	}

}
