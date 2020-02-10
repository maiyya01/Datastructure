package miscellaneous;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFS
{
    private int V;
    private LinkedList<Integer> adj[];
    public GraphDFS(int V)
    {
        this.V = V;
        adj = new LinkedList[V];
        for ( int i=0; i<V;i++)
        {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adj[v].listIterator();

        while( i.hasNext())
        {
            int n = i.next();
            if ( !visited[n])
            {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v)
    {
        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }


    public static void main(String args[])
    {
        GraphDFS graph = new GraphDFS(4);

        graph.addEdge(0, 1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2, 3);
        graph.addEdge(3,3);

        System.out.println(" Following in Depth First traversal starting from vertex");

        graph.DFS(2);
    }
}

