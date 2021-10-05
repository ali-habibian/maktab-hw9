package q3;

public class CustomLinkedList<E> {
    CustomNode head;


    class CustomNode {
        E data;
        CustomNode next;

        public CustomNode(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void put(E data) {
        CustomNode newCustomNode = new CustomNode(data);

        if (head == null) {
            head = newCustomNode;
            return;
        }

        newCustomNode.next = null;

        CustomNode last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newCustomNode;
    }

    public void deleteNode(E data) {
        CustomNode temp = head, prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        // If data was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public boolean search(E data) {
        CustomNode current = head;
        while (current != null) {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList() {
        CustomNode node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
