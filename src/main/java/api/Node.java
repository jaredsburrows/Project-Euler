package api;

public class Node<T> {
    public Node<T> next;
    public Node<T> previous;
    public T value;

    public Node(final T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrevious() {
        return this.next;
    }
}