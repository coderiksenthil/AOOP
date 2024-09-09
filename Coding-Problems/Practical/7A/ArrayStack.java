public class ArrayStack<T> implements Stack<T> {
    private Object[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        array = new Object[capacity];
    }

    @Override
    public void push(T value) {
        if (size == array.length) {
            throw new RuntimeException("Stack is full");
        }
        array[size++] = value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        @SuppressWarnings("unchecked")
        T value = (T) array[--size];
        array[size] = null;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        @SuppressWarnings("unchecked")
        T value = (T) array[size - 1];
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
