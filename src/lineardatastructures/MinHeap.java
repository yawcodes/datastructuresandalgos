package src.lineardatastructures;

import java.util.ArrayList;

public class MinHeap {
    public ArrayList heap;
    public int size;
    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    public void add(int value) {
        this.heap.add(value);
        this.size ++;
        System.out.println("Adding " + value);
        System.out.println(this.heap);
        this.bubbleUp();
    }

    private void bubbleUp() {
        System.out.println("Restoring heap condition");
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.add(42);
    }
}
