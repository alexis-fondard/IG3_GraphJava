package graph;

import java.awt.*;
import java.util.*;

public abstract class Edge {
    protected int id;
    protected Color color;
    protected Vertex[] ends;
    protected double value;

    /**
     * Default constructor
     */
    public Edge(int id, Color color, Vertex[] ends, double value)
    {
        this.id = id;
        this.color = color;
        this.ends = ends;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vertex[] getEnds() {
        return ends;
    }

    public void setEnds(Vertex[] ends) {
        this.ends = ends;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "id=" + id +
                ", color=" + color +
                ", ends=" + Arrays.toString(ends) +
                ", value=" + value +
                '}';
    }
}