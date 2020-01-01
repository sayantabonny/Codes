package hackerrank_challenge;
import java.util.*;

public class Array_DS {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n;i++)
		{
			str=sc.nextInt()+" "+str;
		}
		str=str.trim();
		System.out.println(str);
	}

}
