package hjc.myLinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new Node(2, "ss"));
        list.add(new Node(1, "ss"));
        list.add(new Node(4, "ss"));

        System.out.println(list.length());
    }
}
