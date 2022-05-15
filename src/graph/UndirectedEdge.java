package graph;

import java.awt.*;

public class UndirectedEdge extends Edge {

    /**
     * Default constructor
     */
    public UndirectedEdge(int id, Color color, Vertex[] ends, double value) {
        super(id, color, ends, value);
    }

    /**
     * @return the ends of the undirected edge
     */
    public Vertex[] getEnds() {
        return ends;
    }

}