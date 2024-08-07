package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyList {
    private static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    private static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,-1));
        graph[0].add(new Edge(0,2,-1));

        graph[1].add(new Edge(1,0,-1));
        graph[1].add(new Edge(1,3,-1));

        graph[2].add(new Edge(2,0,-1));
        graph[2].add(new Edge(2,4,-1));

        graph[3].add(new Edge(3,1,-1));
        graph[3].add(new Edge(3,4,-1));
        graph[3].add(new Edge(3,5,-1));

        graph[4].add(new Edge(4,2,-1));
        graph[4].add(new Edge(4,3,-1));
        graph[4].add(new Edge(4,5,-1));

        graph[5].add(new Edge(5,3,-1));
        graph[5].add(new Edge(5,4,-1));
        graph[5].add(new Edge(5,6,-1));
    }

    private static void Neighbours(ArrayList<Edge> graph[],int num){
            for(int i=0; i<graph[num].size(); i++){
                Edge e = graph[num].get(i);
                System.out.print(e.dest + " ");
            }
        System.out.println();
    }

    private static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]== false){
                System.out.print(curr + " ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    private static void dfs(ArrayList<Edge> []graph, int curr, boolean []vis){
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false) dfs(graph,e.dest,vis);
        }
    }
    public static void main(String[] args) {
            int V = 7; // number of vertices in graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        /*
             1 --- 3
           /       |  \
          0        |   5 -- 6
           \       |  /
            2 ---  4

        */

        //Neighbours(graph,2);

      //  bfs(graph,V);
        boolean []vis = new boolean[V];
        dfs(graph,0,vis);
    }
}
