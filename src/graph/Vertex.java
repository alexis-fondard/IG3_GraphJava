package graph;

import java.awt.*;

public class Vertex {
    protected int id;
    private Object info;
    private Color color;

    /**
     * Default constructor
     */
    public Vertex(int id, Object info, Color color) {
        this.id = id;
        this.info = info;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", info=" + info +
                ", color=" + color +
                '}';
    }
}