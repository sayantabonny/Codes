package hackerrank_challenge;
import java.util.*;
import java.math.*;
public class ExtraLongFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		//BigInteger n = new BigInteger(sc.next());
		int n=sc.nextInt();
		BigInteger temp= new BigInteger("1");
		BigInteger factorial= new BigInteger("1");
		int val=0;
		for(int i=1;i<=n/2;i++)
		{
			val=i*(n-i+1);
			temp=BigInteger.valueOf(val);
			factorial=factorial.multiply(temp);
		}
		if(n%2!=0)
		{
			factorial=factorial.multiply(BigInteger.valueOf((n/2)+1));
		}
		System.out.println(factorial);
		sc.close();

	}

}
