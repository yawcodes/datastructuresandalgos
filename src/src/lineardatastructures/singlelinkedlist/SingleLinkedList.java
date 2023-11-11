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
        Node currentNode = this.head;
        Node previousNode = null;
        if (currentNode == null) {
            return null;
        }
        while (currentNode.getNextNode() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        removedTail = currentNode;
        previousNode.setNextNode(null);
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

    public void swapNodes(String data1, String data2) {
        Node node1 = this.head;
        Node node2 = this.head;
        Node node1Prev = null;
        Node node2Prev = null;

        if (data1.equals(data2)) {
            System.out.println("Elements are the same - no swap needed.");
            return;
        }

        while (node1 != null) {
            if (node1.data.equals(data1)) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }

        while (node2 != null) {
            if (node2.data.equals(data2)) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }

        if (node1Prev == null) {
            this.head = node1;
        } else {
            node1Prev.setNextNode(node2);
        }

        if (node2Prev == null) {
            this.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }

        if (node1 == null || node2 == null) {
            System.out.println("Swap not possible - one or more element is not in the list");
            return;
        }

        Node tempNode = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(tempNode);


    }












}
