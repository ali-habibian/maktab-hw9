package q3;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.put(1);
        list.put(2);
        list.put(6);
        list.put(4);
        list.put(5);
        list.printList();

        list.deleteNode(6);
        System.out.println();
        System.out.println("After delete 6");
        list.printList();

        System.out.println();
        System.out.print("Search for 2: ");
        if (list.search(2))
            System.out.println("Found");
        else
            System.out.println("Not Found");

        System.out.println();
        if (list.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println("List is not empty");
    }
}
