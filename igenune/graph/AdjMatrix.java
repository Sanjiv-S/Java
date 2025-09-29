public class AdjMatrix
{
    int vertex;
    int mat[][];
    public AdjMatrix(int v){
        this.vertex=v;
        mat=new int[v][v];
    }
    void addEdge(int source,int destination){
        mat[source][destination]=1;
        mat[destination][source]=1;
    }
    void printmat(){
        System.out.println("Adjacency Matrix: "); 
        for(int i=0;i<vertex;i++){
            for(int j=0;j<vertex;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Traverse for a Specific vertex");
        for(int i=0;i<vertex;i++){
            System.out.print(i+" : ");
            for(int j=0;j<vertex;j++){
                if(mat[i][j]==1)System.out.print(j+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		AdjMatrix graph=new AdjMatrix(7);
		graph.addEdge(0,1);
		graph.addEdge(0,5);
		graph.addEdge(1,2);
	    graph.addEdge(2,3);
	    graph.addEdge(3,4);
	    graph.addEdge(5,6);
	    graph.addEdge(6,4);
	    graph.printmat();
	}
}
