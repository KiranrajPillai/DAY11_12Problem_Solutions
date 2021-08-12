
public class LinkedList {

    Node head;
    static class Node {

        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {

        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();

        int TCSSHARE;
        TCSSHARE=450;
        int LTSHARE;
        LTSHARE=500;
        int RELIANCESHARE;
        RELIANCESHARE=2000;
        list = insert(list, TCSSHARE);
        list = insert(list, LTSHARE);
        list = insert(list, RELIANCESHARE);


        printList(list);
        System.out.println ( " TCS Share is " + TCSSHARE);
        System.out.println ( " L&T Share is " + LTSHARE);
        System.out.println ( " Reliance Share is " + RELIANCESHARE);


    }
}
