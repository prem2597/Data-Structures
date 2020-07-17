import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Stack
 * @author Prem
 */
public class Stack<Item> implements Iterable<Item> {

    private Node<Item> first;
    private int n;

    public Stack() {
        first = null;
        n = 0;
    }

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;        
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack OverFlow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack OverFlow");
        return first.item;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(" ");
        }
        return s.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    private class LinkedIterator implements Iterator<Item> {

        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Stack size is : " + stack.size());

        System.out.println("Enter the Item to push into stack: ");
        String item = sc.nextLine(); 
        
        stack.push(item);
        stack.push("bye");

        System.out.println("Stack size is : " + stack.size());

        System.out.println("The recent item added to stack is: " + stack.peek());

        System.out.println("To print all the elements  in the stack " + stack.toString());

        sc.close();
    }
}

