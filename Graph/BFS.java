package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Sorting.result;

public class BFS {

    private int V;
    private int E;

    LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public BFS(int node)
    {
        this.E=0;
        this.V=node;
        this.adj=new LinkedList[node];
        for(int i=0;i<node;i++)
       {
          this.adj[i]=new LinkedList<>();
       }
    }

    public void addEdge(int u ,int v)
    {
       this.adj[u].add(v);
       this.adj[v].add(u);
       E++;

    }
    public String toString()
    {
        StringBuilder sb =new StringBuilder();

        sb.append(V+": Vertices "+E+": Edges"+"\n");

        for(int v=0;v<V;v++)
        {
            sb.append(v+": ");
            for(int w:adj[v])
            {
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void bfs(int s)
    {
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty())
        {
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:adj[u])
            {
                if(!visited[v])
                {
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }


    public static void main(String[] args) {
        BFS g=new BFS(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        System.out.println(g);
         System.out.println("BFS:");
        g.bfs(0);
    }



    
}
