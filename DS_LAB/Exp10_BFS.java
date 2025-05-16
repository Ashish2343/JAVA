package DS_LAB;
import java.util.*;
public class Exp10_BFS {
    public static class Graph {
        private int numVertices;
        private LinkedList<Integer>[] adjacencyList;

        public Graph(int vertices) {
            numVertices = vertices;
            adjacencyList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            adjacencyList[src].add(dest);
        }

        public void BFS(int startVertex) {
            boolean[] visited = new boolean[numVertices];
            LinkedList<Integer> queue = new LinkedList<>();

            visited[startVertex] = true;
            queue.add(startVertex);

            while (queue.size() != 0) {
                startVertex = queue.poll();
                System.out.print(startVertex + " ");

                for (int adj : adjacencyList[startVertex]) {
                    if (!visited[adj]) {
                        visited[adj] = true;
                        queue.add(adj);
                    }
                }
            }
        }

        public static void main(String[] args) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Breadth First Traversal starting from vertex 2:");

            g.BFS(2);
        }
    }
}
