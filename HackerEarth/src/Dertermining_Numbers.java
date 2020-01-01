import java.util.*;
public class Dertermining_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		int num=0;
		for(int i=0;i<n;i++)
		{
			num=sc.nextInt();
			if(ar.contains(num))
			{
				ar.remove(ar.indexOf(num));
			}
			else
			{
				ar.add(num);
			}
		}
		sc.close();
		System.out.print(ar.get(0)+" "+ar.get(1));
		
	}

}
