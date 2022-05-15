package graph;

import java.awt.*;

public class DirectedEdge extends Edge {
    /**
     * 0 or 1
     */
    private int source;

    /**
     * Default constructor
     */
    public DirectedEdge(int id, Color color, Vertex[] ends, double value, int source) {
        super(id, color, ends, value);
        this.source = source;
    }



    /**
     * @return the source of the directed edge
     */
    public Vertex getSource() {
        return ends[source];
    }

    /**
     * @return the sink of the directed edge
     */
    public Vertex getSink() {
        if (source == 1)
        {
            return ends[0];
        }
        return ends[1];
    }

}