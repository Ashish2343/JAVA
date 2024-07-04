package Graph;

import java.util.ArrayList;

public class All_Path {
    private static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    private static void createGraph(ArrayList<Edge> [] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

    }
    private static void Neighbour(ArrayList<Edge> [] graph, int num){
        for(int i=0; i<graph[num].size(); i++){
            Edge e = graph[num].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();
    }

    private static void PrintAllPath(ArrayList<Edge> [] graph, boolean []vis, int curr, String path, int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]= true;
                    PrintAllPath(graph,vis,e.dest,path+e.dest,tar);
                    vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);
       // Neighbour(graph,3);
        PrintAllPath(graph, new boolean [V],0,"0",5 );
    }
}
