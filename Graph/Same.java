package Graph;

import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class Same {

    private int E;
    private int V;
  LinkedList<Integer>[] adj;

  public Same(int nodes)
  {
     this.E=0;
     this.V=nodes;
    int node;
    this.adj=new LinkedList[nodes];
    for(int i=0;i<nodes;i++)
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
        StringBuilder sb=new StringBuilder();
        sb.append(V+" Vertices, "+E+" edges "+"\n");
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


    public static void main(String[] args) {
        Same g=new Same(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

        System.out.println(g);
    }
    
}
