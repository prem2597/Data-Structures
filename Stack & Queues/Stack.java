import java.util.Iterator;
import java.util.Scanner;

import javafx.scene.Node;
/**
 * Stack
 */
public class Stack<Item> implements Iterable<Item> {

    private Node<Item> first;

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public void push(Item item) {
        Node<Item> oldfirst = first;
        
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String item = sc.nextLine();
            if (item != "-") {
                stack.push(item);
            }
        }
    }
}