package graph;

public interface Graph {
    /**
     * @return the number of vertices
     */
    public int nbOfVertices();

    /**
     * @return the number of edges
     */
    public int nbOfEdges();

    /**
     * EdgeKind: ‘directed’ or ‘undirected’
     * @param vertex1 the first vertex to add
     * @param vertex2 the second vertex to add
     * @param edgeKind the kind of edge to create
     */
    public void addEdge(Vertex vertex1, Vertex vertex2, EdgeKind edgeKind);

    /**
     * @param vertex the vertex to add
     */
    public void addVertex(Vertex vertex);

    /**
     * Whether there is a path between the two vertices (without accounting for the edge directions)
     * @param vertex1 the first vertex to check
     * @param vertex2 the second vertex to check
     * @return True if those are connected ; False otherwise
     */
    public boolean isConnected(Vertex vertex1, Vertex vertex2);

    /**
     * Says whether all vertices are interconnected
     * @return True if all vertices are interconnected ; False otherwise
     */
    public boolean isConnected();

    /**
     * @param vertex1 the first vertex to be checked
     * @param vertex2 the second vertex to be checked
     * @return give edge(s) connecting these vertices
     */
    public Edge getEdges(Vertex vertex1, Vertex vertex2);

    /**
     * @return give all edges of the src.graph
     */
    public Edge getEdges();

    /**
     * @return give all vertices of the src.graph
     */
    public Vertex getVertices();

    /**
     * @param vertex the vertex to be checked
     * @return give edges connected to this vertex
     */
    public Edge getNeighborEdges(Vertex vertex);

    public String toString();

}