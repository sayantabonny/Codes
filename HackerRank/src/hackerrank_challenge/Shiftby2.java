package hackerrank_challenge;

public class Shiftby2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int magic1[]= {8,3,4,9,2,7,6,1};
		int count=0,replace1,replace2;
		
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
		for(int i=0;i<8;i++)
		{
			System.out.println(magic1[i]);
		}
	}

}
