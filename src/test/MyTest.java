package test;

import graph.*;

import java.awt.*;

public class MyTest {
    public static void main(String[] args) {
        Vertex v = new Vertex(1, "src/test", Color.orange);
        Vertex v2 = new Vertex(2, "second vertex", Color.blue);

        Edge e = new UndirectedEdge(3, Color.black, new Vertex[]{v, v2}, 3);

        System.out.println(v);
        System.out.println(v2);
        System.out.println(e);
    }
}