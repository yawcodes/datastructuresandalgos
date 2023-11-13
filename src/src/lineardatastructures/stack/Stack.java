package lineardatastructures.stack;

import lineardatastructures.singlelinkedlist.SingleLinkedList;

public class Stack {
    public int size;
    public int maxSize;
    public SingleLinkedList stack;
    static final int DEFAULT_MAX_VALUE = Integer.MAX_VALUE;

    public Stack() {
        this(DEFAULT_MAX_VALUE);
    }

    public Stack(int maxSize) {
        this.stack = new SingleLinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void push(String data) {
        if (this.hasSpace()) {
            this.stack.addToHead(data);
            System.out.printf("Added %s! Stack size is now %d",data, this.size);
        } else {
            throw new Error("Stack is full!");
        }
    }

    public String pop() {
        if (!this.isEmpty()) {
            String data = this.stack.removeHead().data;
            this.size --;
            System.out.printf("Added %s! Stack size is now %d", data, this.size);
            return data;
        } else {
            throw new Error("Stack is Empty!");
        }
    }

    public String peek() {
        if (!this.isEmpty()) {
            return this.stack.head.data;
        } else {
            return null;
        }
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }
}
