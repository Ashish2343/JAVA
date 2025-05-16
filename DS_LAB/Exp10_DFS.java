package DS_LAB;
import java.util.*;
public class Exp10_DFS {
    public static class Graph {
        private int numVertices; // Number of vertices
        private LinkedList<Integer> adjList[]; // Adjacency List

        // Constructor
        public Graph(int numVertices) {
            this.numVertices = numVertices;
            adjList = new LinkedList[numVertices];
            for (int i = 0; i < numVertices; ++i)
                adjList[i] = new LinkedList<>();
        }

        // Method to add an edge to the graph
        public void addEdge(int source, int destination) {
            adjList[source].add(destination);
        }

        // Helper method for DFS traversal
        private void DFSUtil(int vertex, boolean visited[]) {
            // Mark the current node as visited and print it
            visited[vertex] = true;
            System.out.print(vertex + " ");

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> it = adjList[vertex].listIterator();
            while (it.hasNext()) {
                int adjacentVertex = it.next();
                if (!visited[adjacentVertex])
                    DFSUtil(adjacentVertex, visited);
            }
        }

        // DFS traversal of the vertices reachable from a given vertex
        public void DFS(int startVertex) {
            // Mark all the vertices as not visited
            boolean visited[] = new boolean[numVertices];

            // Call the recursive helper function to print DFS traversal
            DFSUtil(startVertex, visited);
        }

        public static void main(String args[]) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Following is Depth First Traversal " +
                    "(starting from vertex 2)");

            g.DFS(2);
        }
    }
}
