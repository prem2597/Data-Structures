import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Stack
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

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        // while(sc.hasNextLine()) {
        //     String item = sc.nextLine();
        //     if (item != "-") {
        //         stack.push(item);
        //     } else if(!stack.isEmpty()) {
        //         System.out.println(stack.pop() + " ");
        //     }
        // }
        System.out.println("Stack size is : " + stack.size());

        System.out.println("Enter the Item to push into stack: ");
        String item = sc.nextLine(); 
        stack.push(item);

        System.out.println("Stack size is : " + stack.size());

        System.out.println("The recent item added to stack is: " + stack.peek());

        System.out.println("To print all the elements  in the stack" + stack.toString());
    }
}

