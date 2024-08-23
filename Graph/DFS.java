package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Sorting.result;

public class DFS {

    private int V;
    private int E;

    LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public DFS(int node)
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
        Stack<Integer> stack=new Stack<>();
       
        stack.push(s);
        while(!stack.isEmpty())
        {
            int u=stack.pop();
            if(!visited[u])
            {
                visited[u]=true;
                System.out.print(u+" ");
            
           
            for(int v:adj[u])
            {
                if(!visited[v])
                {
                    stack.push(v);
                }
            }
        }
        }
    }


    public static void main(String[] args) {
        DFS g=new DFS(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        System.out.println(g);
         System.out.println("DFS:");
        g.bfs(0);
    }



    
}
