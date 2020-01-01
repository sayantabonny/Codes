package hackerearth_graph;

import java.util.*;


public class So_NP {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		Components ar[]=new Components[n];
		int edge_count=1;
		int ui,vi;
		int flag=-1; int size=-1;
		while(edge_count<=m)
		{
			//System.out.println("\n Number of Components "+ size);
			ui=sc.nextInt();
			vi=sc.nextInt();
			flag=-1;
			for(int j=0;j<=size;j++)
			{
				if(ar[j].search(ui)||ar[j].search(vi))
				{
					ar[j].addNodes(ui, vi);
					flag=1;
					//System.out.println("Ranjan "+ ui+" "+vi);
				}
				
			}
			
			if(flag==-1)
			{
				size++;
				ar[size]=new Components();
				ar[size].addNodes(ui, vi);
				//System.out.println(" hello "+ ui+" "+vi);	
			}
			edge_count++;	
		}
		sc.close();
		
		//System.out.println("\n Number of Components "+ size);
		int k_size=size+1; int n_num=0;int edge_num=0;
		for(int j=0;j<=size;j++)
		{
			n_num=n_num+ar[j].getNoOfNodes();
			edge_num=edge_num+ar[j].getEdges();
		}
		k_size=k_size+(n-n_num);
		int edge_removed=m-edge_num;
		//System.out.println(k_size+" "+k+" "+n+" "+n_num+" ");
		if(k_size>k)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(edge_removed+(k-k_size));
		}

	}

}

class Components
{
	
	private Set<Integer> nodes;
	private int no_of_nodes;
	private int edges;
	Components()
	{
		nodes=new HashSet<>();
	}
	public void addNodes(int u,int v)
	{
		nodes.add(u);
		nodes.add(v);
		edges=nodes.size()-1;
		no_of_nodes=nodes.size();
	}
	public boolean search(int n)
	{
		return nodes.contains(n);
	}
	public int getEdges() {
		return edges;
	}
	public int getNoOfNodes() {
		return no_of_nodes;
	}
	
}
