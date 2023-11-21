package nonlineardatastructures.graph;

public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;


    public Edge(Vertex start, Vertex end, Integer inputWeight) {
        this.start = start;
        this.end = end;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }

}
