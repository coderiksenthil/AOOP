import java.util.Arrays;

public class PriorityQueue<T extends Comparable<T>> {

    private Object[] heap;
    private int size;

    public PriorityQueue(int capacity) {
        heap = new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == heap.length) {
            resize();
        }
        heap[size] = element;
        heapifyUp(size);
        size++;
    }

    public T remove() {
        if (size == 0) {
            return null;
        }
        T min = (T) heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && ((T) heap[parentIndex]).compareTo((T) heap[index]) > 0) {
            swap(parentIndex, index);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;

        if (leftChildIndex < size && ((T) heap[leftChildIndex]).compareTo((T) heap[smallest]) < 0) {
            smallest = leftChildIndex;
        }

        if (rightChildIndex < size && ((T) heap[rightChildIndex]).compareTo((T) heap[smallest]) < 0) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            swap(smallest, index);
            heapifyDown(smallest);
        }
    }

    private void swap(int i, int j) {
        Object temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resize() {
        Object[] newHeap = new Object[heap.length * 2];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(5);
        intQueue.add(5);
        intQueue.add(10);
        intQueue.add(3);
        intQueue.add(8);
        intQueue.add(1);
        System.out.println("Integer Priority Queue:");
        intQueue.print();
        System.out.println("Removed: " + intQueue.remove());
        System.out.println("Removed: " + intQueue.remove());
        System.out.println("Removed: " + intQueue.remove());

        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(5);
        doubleQueue.add(5.5);
        doubleQueue.add(10.2);
        doubleQueue.add(3.1);
        doubleQueue.add(8.8);
        doubleQueue.add(1.9);
        System.out.println("Double Priority Queue:");
        doubleQueue.print();
        System.out.println("Removed: " + doubleQueue.remove());
        System.out.println("Removed: " + doubleQueue.remove());
        System.out.println("Removed: " + doubleQueue.remove());

        PriorityQueue<String> stringQueue = new PriorityQueue<>(5);
        stringQueue.add("apple");
        stringQueue.add("banana");
        stringQueue.add("cherry");
        stringQueue.add("date");
        stringQueue.add("elderberry");
        System.out.println("String Priority Queue:");
        stringQueue.print();
        System.out.println("Removed: " + stringQueue.remove());
        System.out.println("Removed: " + stringQueue.remove());
        System.out.println("Removed: " + stringQueue.remove());
    }
}
