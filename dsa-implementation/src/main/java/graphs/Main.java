package graphs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graphs myGraph = new Graphs();
		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		
		myGraph.addEdge("A", "B");
		myGraph.addEdge("A", "C");
		myGraph.addEdge("A", "D");
		myGraph.addEdge("B", "D");
		myGraph.addEdge("C", "D");
		
		
		myGraph.printGraph();
		
//		myGraph.removeEdge("A", "B");
		
		
		
		myGraph.removeVertex("D");
		myGraph.printGraph();

	}

}
