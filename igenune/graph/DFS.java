import java.util.*;
public class DFS
{
    int vertex;
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    boolean visited[];
    public DFS(int v){
        this.vertex=v;
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        System.out.println("Initially the list is: "+list);
        visited = new boolean[v];
    }
    void addEdge(int source,int destination){
        list.get(source).add(destination);
        list.get(destination).add(source);
        System.out.println(list);
    }
    // DFS traversal using recursion
    public void DFS(int startVertex) {
        Arrays.fill(visited, false); 
        DFSrec(startVertex);
    }

    private void DFSrec(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for(int a:list.get(v)){
            if (!visited[a]) {
                DFSrec(a);
            }
        }
    }

    //DFS traversal using stack(iterative).
    public void DFSStack(int startVertex){
        Arrays.fill(visited, false);
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        while(!stack.isEmpty()){
            int v = stack.pop();
            if(!visited[v]){
                System.out.print(v + " ");
                visited[v] = true;
                for(int a:list.get(v)){
                    if(!visited[a]){
                        stack.push(a);
                    }
                }
            }
        }
    }

    void printlist(){
        System.out.println("Adjacency List: ");
        for(int i=0;i<vertex;i++){
            System.out.print("Source vertex : "+i+" -> ");
            for(int a:list.get(i)){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println(list);
    }
	public static void main(String[] args) {
		DFS graph=new DFS(7);
		graph.addEdge(0,1);
		graph.addEdge(0,5);
		graph.addEdge(1,2);
	    graph.addEdge(2,3);
	    graph.addEdge(3,4);
	    graph.addEdge(5,6);
	    graph.addEdge(6,4);
	    graph.printlist();
	    graph.DFS(0);
	    System.out.println();
	    graph.DFSStack(0);
	}
}
