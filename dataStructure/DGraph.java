package dataStructure;

import java.util.Collection;
import java.util.HashMap;

public class DGraph implements graph{
HashMap<Integer, vertex> graph ;
int size_vertex;
int size_edge;
//consractour
public DGraph () {
	graph = new HashMap<Integer, vertex>();
	size_vertex=0;
	size_edge = 0;
}
	@Override
	public node_data getNode(int key) {
		if (graph.containsKey(key))
			return (graph.get(key));
		else {
			
		System.out.println("is not exist");
		}
		return null; //is not excist;
	}

	@Override
	public edge_data getEdge(int src, int dest) {
		
		if (graph.containsKey(src)) 
			if (graph.get(src).edges.containsKey(dest) )
				return graph.get(src).edges.get(dest);
	
		//else
		System.out.println("is not exist");

			return null;
	}

	@Override
	public void addNode(node_data n) {
		vertex p= (vertex) n;
		graph.put(n.getKey(), p);
		size_vertex++;
	}

	@Override
	public void connect(int src, int dest, double w) {
		edge connect = new edge(src, src, w);
	if (graph.containsKey(src)&&graph.get(src).edges.containsKey(dest)) {
		graph.get(src).edges.put(dest, connect);
		size_edge++;
	}
	}

	@Override
	public Collection<node_data> getV() {
		// TODO Auto-generated method stub
		return (Collection<node_data>) graph ;
	}

	@Override
	public Collection<edge_data> getE(int node_id) {
		// TODO Auto-generated method stub
		return (Collection<edge_data>) graph.get(node_id);
	}

	@Override
	public node_data removeNode(int key) {
 // connect between the other  
		graph.remove(key);
		size_vertex++;
		return graph.get(key) ;
	}

	@Override
	public edge_data removeEdge(int src, int dest) {
		size_edge--;
		return null;
	}

	@Override
	public int nodeSize() {
		// TODO Auto-generated method stub
		return size_vertex;
	}

	@Override
	public int edgeSize() {
		// TODO Auto-generated method stub
		return size_edge;
	}

	@Override
	public int getMC() {
		// TODO Auto-generated method stub
		return 0;
	}

}
