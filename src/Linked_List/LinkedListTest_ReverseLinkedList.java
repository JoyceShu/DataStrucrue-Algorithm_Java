package Linked_List;

public class LinkedListTest_ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.insert("Rose");
        l1.insert("Jennie");
        l1.insert("List");
        l1.insert("Jisoo");

        for (String l: l1){
            System.out.println(l);
        }

        System.out.println("--------------------------------------");
        l1.reverse();
        for (String l: l1){
            System.out.println(l);
        }


    }
}
