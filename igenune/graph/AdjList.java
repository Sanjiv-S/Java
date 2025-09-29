import java.util.*;
public class AdjList
{
    int vertex;
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public AdjList(int v){
        this.vertex=v;
        
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        System.out.println("Initially the list is: "+list);
    }
    void addEdge(int source,int destination){
        list.get(source).add(destination);
        list.get(destination).add(source);
        System.out.println(list);
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
		AdjList graph=new AdjList(7);
		graph.addEdge(0,1);
		graph.addEdge(0,5);
		graph.addEdge(1,2);
	    graph.addEdge(2,3);
	    graph.addEdge(3,4);
	    graph.addEdge(5,6);
	    graph.addEdge(6,4);
	    graph.printlist();
	}
}
