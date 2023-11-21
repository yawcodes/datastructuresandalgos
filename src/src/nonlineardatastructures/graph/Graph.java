package nonlineardatastructures.graph;

import java.util.ArrayList;

public class Graph {
    public ArrayList<Vertex> vertices;
    public boolean isWeighted;
    public boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) weight = null;
        if (this.isDirected == false) {
            vertex1.addEdge(vertex2, weight);
        }
        vertex2.addEdge(vertex1, weight);
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
       if (this.isDirected == false) {
           vertex1.removeEdge(vertex2);
       }
       vertex2.removeEdge(vertex1);
    }


    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }
}
