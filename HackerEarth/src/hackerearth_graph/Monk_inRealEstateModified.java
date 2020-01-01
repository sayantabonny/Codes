package hackerearth_graph;

import java.util.*;


public class Monk_inRealEstateModified {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int TestCase=sc.nextInt();
		int ans[]=new int[TestCase];
		
		int counter=0; int road_counter=0;  int ui,vi;  
		int no_ofRoads=0; int flag=-1; int size=-1;
		
		Set <Integer> cities;
		while(counter<TestCase)
		{
			size=-1;
			
			no_ofRoads=sc.nextInt();
			cities=new HashSet<>();
			road_counter=0;
			while(road_counter<no_ofRoads)
			{
				ui=sc.nextInt();
				vi=sc.nextInt();
				cities.add(ui);
				cities.add(vi);
				road_counter++;
				
			}
			ans[counter]=cities.size();
			counter++;
			}
		sc.close();
		
		//System.out.println("\n Number of Components "+ size);
		for(int j=0;j<counter;j++)
		{
			 System.out.println(ans[j]);
		}
	   
		//System.out.println(k_size+" "+k+" "+n+" "+n_num+" ");
		

	}

}

