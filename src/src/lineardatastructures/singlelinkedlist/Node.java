package lineardatastructures.singlelinkedlist;

public class Node {
    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node getNextNode() {
        return this.next;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

}
