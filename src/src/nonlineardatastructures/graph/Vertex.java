package nonlineardatastructures.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }

    public String getData() {
        return data;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        Edge newEdge = new Edge(this, endVertex, weight);
        this.edges.add(newEdge);
    }

    public void removeEdge(Vertex endVertex) {
        this.edges.removeIf(edge -> edge.getEnd() == endVertex);
    }

}
