package algorithms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import dataStructure.DGraph;
import dataStructure.edge_data;
import dataStructure.graph;
import dataStructure.node_data;
import dataStructure.vertex;
import utils.Point3D;
/**
 * This empty class represents the set of graph-theory algorithms
 * which should be implemented as part of Ex2 - Do edit this class.
 * @author 
 *
 */
public class Graph_Algo implements graph_algorithms{
	graph graph_alg;
	//
//	constractur
	public Graph_Algo () {
		DGraph graph_algo = new DGraph();
	}
	@Override
	public void init(graph g) {
	this.graph_alg = g; // try	
	
	}

	@Override
	public void init(String file_name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(String file_name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isConnected() {
		
		dfs ( this.graph_alg.getNode(0));
		Collection<node_data> vertex_collect = this.graph_alg.getV();
		for (node_data vertex: vertex_collect) {
			if (vertex.getTag()==0)
				return false;
		}
		return true;
	}

	private void dfs(node_data node) {
			node.setTag(1); //visited 
			Collection<edge_data> edge_collect = this.graph_alg.getE(node.getKey());
			for (edge_data edge : edge_collect) {
				int next_vertex = edge.getDest();
				if (this.graph_alg.getNode(next_vertex).getTag()!=1) {
					dfs (this.graph_alg.getNode(next_vertex));
				}
					
			}
	}

	@Override
	public double shortestPathDist(int src, int dest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<node_data> shortestPath(int src, int dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<node_data> TSP(List<Integer> targets) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public graph copy() {
		// copy the vertex to Map
		graph copy =new DGraph();
				Collection<node_data> c =graph_alg.getV();
				Iterator<node_data> iter1 = c.iterator();
				for (node_data ver: c)
				{
					// add to vertex
					copy.addNode(ver);
					// copy the edges
					Collection<edge_data> c2 =graph_alg.getE(ver.getKey());
					for (edge_data edge : c2)
					// connect vertex to vertex
					{	
						copy.connect(ver.getKey(), edge.getDest(), edge.getWeight());
					}
				}
				return copy;
	}

}
