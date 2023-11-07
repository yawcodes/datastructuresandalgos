package lineardatastructures.singlelinkedlist;

public class SingleLinkedList {
    public Node head;

    public SingleLinkedList() {
        this.head = null;
    }

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
        } else {
            this.head = removedHead.getNextNode();
        }
        System.out.printf("******** Successfully removed: \"%s\" \n", removedHead.data);
        return removedHead;
    }

    public Node removeTail() {
        System.out.println("**** Removing tail Node ****");
        Node removedTail = this.head;
        Node previousNode = null;
        if (removedTail == null) {
            System.out.println("List is Empty!");
            return null;
        }
        if (removedTail.getNextNode() == null) {
            this.removeHead();
        } else {
            while (removedTail.getNextNode() != null) {
                previousNode = removedTail;
                removedTail = removedTail.getNextNode();
            }
            previousNode.setNextNode(null);
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
        Node currentNode = this.head;
        if (currentNode == null) {
            this.addToHead(data);
        } else {
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node(data));
        }
        System.out.printf("******** Successfully added \"%s\" as new tail node. \n", data);
    }

    public void addToHead(String data) {
        System.out.println("**** Adding to Head Node ****");
        Node newHead = new Node(data);
        Node currentHead = this.head;
        if (currentHead == null) {
            this.head = newHead;
        } else {
            this.head = newHead;
            this.head.setNextNode(currentHead);
        }
        System.out.printf("******** Successfully added \"%s\" as new head node. \n", data);
    }
}
