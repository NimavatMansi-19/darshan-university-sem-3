import java.util.*;
//DFS and BFS for directed graph
class GraphUD{
    Map<Integer,List<Integer>> grp;
    GraphUD(){
        grp=new HashMap<>();
    }
    public void edge(int u,int v) {
        grp.putIfAbsent(u,new  ArrayList<>());
        grp.putIfAbsent(v,new  ArrayList<>());
        grp.get(u).add(v);
        //grp.get(v).add(u);
        
    }
    public void DFS(int start) {
        Set<Integer> visited=new HashSet<>();
        DFShelp(start,visited);
        
    }
    public void DFShelp(int start,Set<Integer> visited) {
        visited.add(start);
        System.out.print(start+",");
        for(int i:grp.getOrDefault(start, new ArrayList<>())){
            if(!visited.contains(i)){
                DFShelp(i, visited);
            }
        }
        
    }
    public void BSF(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        
        visited.add(start);
        queue.add(start);
        
        System.out.print("BFS starting from vertex " + start + ": ");
        
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            
            for (int neighbor : grp.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
}
}
public class Undirected_DFS_BFS{
    public static void main(String[] args) {
        GraphUD g=new GraphUD();
        g.edge(1, 2);
        g.edge(6, 1);
        g.edge(2, 4);
        g.edge(4,5);
        g.edge(4, 3);
        g.edge(5, 3);
        g.edge(5, 6);
        g.edge(6, 3);
        System.out.println("DFS==");
        g.DFS(1);
        System.out.println();
        g.BSF(1);
        
    }
}