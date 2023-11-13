package lineardatastructures.queue;

import lineardatastructures.singlelinkedlist.SingleLinkedList;

public class Queue {
    public int size;
    public SingleLinkedList queue;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new SingleLinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void enqueue(String data) {
        if (this.hasSpace()) {
            this.queue.addToTail(data);
            this.size ++;
            System.out.printf("Adding %s! to the Queue. Queue size is now %d", data, this.size);
        } else {
            throw new Error("Queue is full");
        }
    }

    public String dequeue() {
        if (!this.isEmpty()) {
            String data = this.queue.removeHead().data;
            this.size --;
            System.out.printf("Removing %s! to the Queue. Queue size is now %d", data, this.size);
            return data;
        } else {
            throw new Error("Queue is Empty!");
        }

    }

    public String peek() {
        if (!this.isEmpty()) {
            return this.queue.head.data;
        } else {
            return "Queue is Empty!";
        }
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    public boolean isEmpty() {
        return this.size == 0;

    }


}
