package graph;

public class IncidenceArrayGraph implements Graph {
    private Vertex[] vertexArray;
    private int maxVertex;
    private static int nbVertex = 0;
    private Edge[] edgesArray;
    private static int nbEdge = 0;
    private Edge[][] incidenceArray;

    /**
     * Constructor of an IncidenceArrayGraph
     * @param maxVertex the max number of Vertex
     */
    public IncidenceArrayGraph(int maxVertex) {
        this.vertexArray = new Vertex[maxVertex];
        this.maxVertex = maxVertex;
        this.edgesArray = new Edge[maxVertex * maxVertex];
        this.incidenceArray = new Edge[maxVertex][maxVertex * maxVertex];

    }


    /**
     * number of vertices of the graph
     * @return : int
     */
    @Override
    public int nbOfVertices() {
        return nbVertex;
    }

    /**
     * number of edges in the graph
     * @return : int
     */
    @Override
    public int nbOfEdges() {
        return nbEdge;
    }

    /**
     * add a vertex to the graph
     * @param vertex : graph.Vertex
     */
    @Override
    public void addVertex(Vertex vertex) {
        if(nbVertex<this.maxVertex){
            this.vertexArray[nbVertex] = vertex;
            nbVertex++;
        }
        else{
            System.out.println("Maximum number of vertices reach");
        }

    }


    /**
     * add an undirected edge to the graph
     * @param vertex  : graph.Vertex - extremity one of the edge
     * @param vertex1  : graph.Vertex - extremity two of the edge
     */
    @Override
    public void addEdge(Vertex vertex, Vertex vertex1) {
        if(nbEdge<this.maxVertex*this.maxVertex){
            this.edgesArray[nbEdge] = new Edge(vertex,vertex1,1,Color.Bleu);
            this.incidenceArray[vertex.id][nbEdge] = this.edgesArray[nbEdge];
            this.incidenceArray[vertex1.id][nbEdge] = this.edgesArray[nbEdge];
            nbEdge++;
        }
        else{
            System.out.println("Maximum number of edges reach");
        }

    }

    /**
     * whether there is a path between the two vertices (without accounting for the edge directions)
     * @param vertex : graph.Vertex
     * @param vertex1 : graph.Vertex
     * @return true whether there is a path between the two vertices (without accounting for the edge directions)
     */
    @Override
    public boolean isConnected(Vertex vertex, Vertex vertex1) {
        for(int i=0;i<=maxVertex*maxVertex;i++){
            if(incidenceArray[vertex.id][i]!=null){
                return incidenceArray[vertex1.id][i]!=null;
            }
        }
        return false;
    }

    /**
     * says whether all vertices are interconnected
     * @return true whether all vertices are interconnected
     */
    @Override
    public boolean isConnected() {
        //NOT IMPLEMENTED
        return false;
    }

    /**
     * give edge(s) connecting these vertices
     * @param vertex : graph.Vertex
     * @param vertex1 : graph.Vertex
     * @return Edge[]
     */
    @Override
    public Edge[] getEdges(Vertex vertex, Vertex vertex1) {
        Edge[] res = new Edge[1];
        for(Edge e: this.edgesArray){
            if((e.getEnds()[0]==vertex && e.getEnds()[1]==vertex1) || (e.getEnds()[0]==vertex1 && e.getEnds()[1]==vertex)){
                res[0]=e;
            }
        }
        return res;
    }

    /**
     * give all edges of the graph
     * @return Edge[]
     */
    @Override
    public Edge[] getEdges() {
        return this.edgesArray;
    }

    /**
     * give all vertices of the graph
     * @return graph.Vertex
     */
    @Override
    public Vertex[] getVertices() {
        return this.vertexArray;
    }

    /**
     * give edges connected to this vertex
     * @param vertex : graph.Vertex
     * @return Edge[]
     */
    @Override
    public Edge[] getNeighborEdges(Vertex vertex) {
        int tabSize = 0;
        for(Edge e: this.edgesArray){
            if(e.getEnds()[0]==vertex || e.getEnds()[1]==vertex){
                tabSize++;
            }
        }
        Edge[] resTab = new Edge[tabSize];
        int j=0;
        for(Edge e: this.edgesArray){
            if(e.getEnds()[0]==vertex || e.getEnds()[1]==vertex){
                resTab[j]=e;
                j+=1;
            }
        }
        return resTab;
    }

    public String toString() {
        return "- array : " + this.getVertices().toString()  ;
    }
}