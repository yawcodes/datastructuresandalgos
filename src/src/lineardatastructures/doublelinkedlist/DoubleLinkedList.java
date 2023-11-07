package lineardatastructures.doublelinkedlist;

public class DoubleLinkedList {
    public Node head;
    public Node tail;

    public String printLinkedList() {
        StringBuilder output = new StringBuilder("<head> ");
        Node currentNode = this.head;
        while (currentNode != null) {
            output.append(currentNode.data).append(" --> ");
            currentNode = currentNode.getNextNode();
        }
        output.append("<tail>");
        System.out.println(output);
        return output.toString();
    }

    public Node removeHead() {
        System.out.println("**** Removing Head Node ****");
        Node removedHead = this.head;
        if (removedHead == null) {
            System.out.println("LinkedList is Empty!");
            return null;
        }
        this.head = removedHead.getNextNode();
        this.head.setPreviousNode(null);
        if (removedHead == this.tail) {
            this.removeTail();
        }
        System.out.printf("******** Successfully removed: \"%s\" \n", removedHead.data);
        return removedHead;
    }

    public Node removeTail() {
        System.out.println("**** Removing tail Node ****");
        Node removedTail = this.tail;
        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        if (this.tail == this.head) {
            this.removeHead();
        }
        System.out.printf("******** Successfully removed: \"%s\" \n", removedTail.data);
        return removedTail;
    }

    public Node removeByData(String data) {
        System.out.println("**** Removing node by data ****");
        Node nodeToRemove = null;
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        if (nodeToRemove == null) {
            return null;
        }
        System.out.printf("******** Successfully removed \"%s\" from linkedList\n", nodeToRemove.data);
        return nodeToRemove;
    }

    public void addToTail(String data) {
        System.out.println("**** Adding Tail Node ****");
        Node currentNode = this.tail;
        Node newTail = new Node(data);
        if (currentNode != null) {
            currentNode.setNextNode(newTail);
            newTail.setPreviousNode(currentNode);
        }
        this.tail = newTail;
        if (this.head == null) {
            this.head = this.tail;
        }
        System.out.printf("******** Successfully added \"%s\" as new tail node. \n", data);
    }

    public void addToHead(String data) {
        System.out.println("**** Adding to Head Node ****");
        Node newHead = new Node(data);
        Node currentHead = this.head;
        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;
        if (this.tail == null) {
            this.tail = this.head;
        }
        System.out.printf("******** Successfully added \"%s\" as new head node. \n", data);
    }

}
