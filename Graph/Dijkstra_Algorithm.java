package Graph;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {
    private static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    private static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }

    private static void createGraph(ArrayList<Edge> [] graph){
        for (int i = 0; i < graph.length; i++) {
            graph [i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }


    private static void dijkstra(ArrayList<Edge> [] graph, int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int [] dist = new int[V];
        boolean [] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(0,0));

        // bfs

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); // Shortest dist
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for (int i = 0; i < graph[curr.node].size() ; i++) {
                        Edge e = graph[curr.node].get(i);
                        int u = e.src;
                        int v = e.dest;
                        if(dist[u] + e.wt < dist[v]){
                            dist[v] = dist[u] + e.wt;
                        }
                }
            }
        }


    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);



    }
}
