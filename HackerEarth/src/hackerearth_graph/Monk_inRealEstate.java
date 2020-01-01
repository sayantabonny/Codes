package hackerearth_graph;

import java.util.*;


public class Monk_inRealEstate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int TestCase=sc.nextInt();
		int ans[]=new int[TestCase];
		
		int counter=0; int road_counter=0; Components_1 ar[]; int ui,vi; int size=-1; int n_num=0; int temp1=-1,temp2=-1;
		int no_ofRoads=0; int flag=-1;
		
		while(counter<TestCase)
		{
			size=-1;
			
			no_ofRoads=sc.nextInt();
			ar=new Components_1[no_ofRoads];
			road_counter=0;
			while(road_counter<no_ofRoads)
			{
				ui=sc.nextInt();
				vi=sc.nextInt();
				
				 
				 
				flag=-1;
				for(int j=0;j<=size;j++)
				{
					if(ar[j].search(ui)||ar[j].search(vi))
					{
						//System.out.println(ui+" "+vi+" "+ar[j].search(ui)+" "+ar[j].search(vi)+" "+ar[j].getNodes()+" "+j);
						
						ar[j].addNodes(ui, vi);
						if(flag==-1)
						{
							temp1=j;
						}
						flag++;
						//System.out.println("Ranjan "+ ui+" "+vi);
						if(flag==1)
						{
							temp2=j;
							
							//System.out.println(temp1+" "+temp2+" "+ar[temp1].getNodes()+" "+ar[temp2].getNodes()+"");
							ar[temp1].MergeList(ar[temp2].getNodes());
						//	System.out.println(ar[temp1].getNodes());
							for(int k=temp2;k<size;k++)
							{
								ar[k]=ar[k+1];
							}
							size--;
						}
						
					  }
					//System.out.println(ar[j].getNodes());
					
				}
				
				if(flag==-1)
				{
					size++;
					ar[size]=new Components_1();
					ar[size].addNodes(ui, vi);
					//System.out.println(" hello "+ ui+" "+vi);	
				}
				road_counter++;	
			
			}
			n_num=0;
			for(int j=0;j<=size;j++)
			{
				n_num=n_num+ar[j].getNoOfNodes();
				//System.out.println(j+" "+ar[j].getNodes()+" "+ar[j].getNoOfNodes());
			}
			ans[counter]=n_num;
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

class Components_1
{
	
	private Set<Integer> nodes;
	private int no_of_nodes;
	//private int edges;
	Components_1()
	{
		nodes=new HashSet<>();
	}
	public void addNodes(int u,int v)
	{
		nodes.add(u);
		nodes.add(v);
		//edges=nodes.size()-1;
		no_of_nodes=nodes.size();
	}
	public boolean search(int n)
	{
		return nodes.contains(n);
	}
	
	public int getNoOfNodes() {
		return no_of_nodes;
	}
	public Set<Integer> getNodes() {
		return nodes;
	}
	public void MergeList(Set a1)
	{
		nodes.addAll(a1);
		no_of_nodes=nodes.size();
	}
	
}
