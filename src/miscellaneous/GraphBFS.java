package miscellaneous;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS
{

    private int V;
    private LinkedList<Integer> adj[]; //Adjancent list

    GraphBFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for ( int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    //function to add edge to graph
    void addEdge(int v, int w )
    {
        adj[v].add(w);
    }

    //prints BFS Traversal from a given source
    void BFS(int s)
    {
        //Mark all the vertices as not visited ( By Default)
        boolean visited[] = new boolean[V];


        // create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while ( queue.size() != 0)
        {

            s= queue.poll();
            System.out.println(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while ( i.hasNext())
            {
                int n = i.next();
                if ( !visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


    public static void main(String[] args)
    {
        GraphBFS g = new GraphBFS(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2, 3);
        g.addEdge(3,3);

        System.out.println(" Following is Breadth first traversal " + "starting from vertex 2");

        g.BFS(2);
    }
}
