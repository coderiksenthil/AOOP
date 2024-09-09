public class Main {
    public static void main(String[] args) {
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.isEmpty());
        System.out.println(linkedListStack.size());

        Stack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("cherry");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.size());
    }
}
